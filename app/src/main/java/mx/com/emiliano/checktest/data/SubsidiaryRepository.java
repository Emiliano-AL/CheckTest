package mx.com.emiliano.checktest.data;

import android.util.Log;

import mx.com.emiliano.checktest.retrofit.response.ResultSubsidiary;
import mx.com.emiliano.checktest.retrofit.response.Subsidiary;
import retrofit2.Call;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import mx.com.emiliano.checktest.retrofit.ISubsidiaryService;
import mx.com.emiliano.checktest.retrofit.SubsidiaryClient;
import retrofit2.Callback;
import retrofit2.Response;

public class SubsidiaryRepository {
    private MutableLiveData<List<Subsidiary>> allSubsidiarys;
    private SubsidiaryClient client;
    private ISubsidiaryService service;
    public SubsidiaryRepository(){
        allSubsidiarys = new MutableLiveData<>();
        service = SubsidiaryClient.getRetrofitSubsidiaryInstance().create(ISubsidiaryService.class);
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
