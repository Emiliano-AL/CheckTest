package mx.com.emiliano.checktest.data;

import android.util.Log;

import mx.com.emiliano.checktest.common.MyApp;
import mx.com.emiliano.checktest.retrofit.response.DetailSubsidiary;
import mx.com.emiliano.checktest.retrofit.response.ResultSubsidiary;
import mx.com.emiliano.checktest.retrofit.response.Subsidiary;
import mx.com.emiliano.checktest.ui.dialogs.DetailsSubsidiaryDialog;
import retrofit2.Call;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import mx.com.emiliano.checktest.retrofit.ISubsidiaryService;
import mx.com.emiliano.checktest.retrofit.SubsidiaryClient;
import retrofit2.Callback;
import retrofit2.Response;

public class SubsidiaryRepository {
    private MutableLiveData<List<Subsidiary>> allSubsidiarys;
    private MutableLiveData<DetailSubsidiary> detailSubsiduary;
    private SubsidiaryClient client;
    private ISubsidiaryService service;
    public SubsidiaryRepository(){
        allSubsidiarys = new MutableLiveData<>();
        service = SubsidiaryClient.getRetrofitSubsidiaryInstance().create(ISubsidiaryService.class);
    }

    public LiveData<DetailSubsidiary> getDetailSubsidiary(String keySubsidiary) {
        if (detailSubsiduary == null)
            detailSubsiduary = new MutableLiveData<>();

        Call<DetailSubsidiary> call = service.getSubsidiaryDetail(keySubsidiary);
        call.enqueue(new Callback<DetailSubsidiary>() {
            @Override
            public void onResponse(Call<DetailSubsidiary> call, Response<DetailSubsidiary> response) {
                if (response.isSuccessful()) {
                    detailSubsiduary.setValue(response.body());
                    DetailsSubsidiaryDialog dialog = DetailsSubsidiaryDialog.newInstance(response.body());
//                    MyApp app = MyApp.getInstance();
//                    dialog.show(((AppCompatActivity) app.getContext()).getSupportFragmentManager(), "DetailsSubsidiaryDialog");
                } else {
                    Log.d("Repo", "Error en la solicitud");
                }
            }

            @Override
            public void onFailure(Call<DetailSubsidiary> call, Throwable t) {
                Log.d("Repo", "La red falló");
            }
        });

        return detailSubsiduary;
    }

    public MutableLiveData<List<Subsidiary>> getAllSubsidiarys(){
        if(allSubsidiarys == null)
            allSubsidiarys = new MutableLiveData<>();
        Call<ResultSubsidiary> call = service.getSubsidiarys();
        call.enqueue(new Callback<ResultSubsidiary>() {
            @Override
            public void onResponse(Call<ResultSubsidiary> call, Response<ResultSubsidiary> response) {
                if(response.isSuccessful()){
                    Log.d("Repo", "");
                    allSubsidiarys.setValue(response.body().getSubsidiaryList());
                }else{
                    Log.d("Repo", "Error en la solicitud");
                }
            }

            @Override
            public void onFailure(Call<ResultSubsidiary> call, Throwable t) {
                Log.d("Repo", "La red falló");
            }
        });
        return allSubsidiarys;
    }
}
