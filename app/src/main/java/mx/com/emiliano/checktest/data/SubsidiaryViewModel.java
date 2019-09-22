package mx.com.emiliano.checktest.data;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import mx.com.emiliano.checktest.retrofit.response.DetailSubsidiary;
import mx.com.emiliano.checktest.retrofit.response.Subsidiary;
import mx.com.emiliano.checktest.ui.dialogs.DetailsSubsidiaryDialog;

public class SubsidiaryViewModel extends AndroidViewModel {
    private LiveData<List<Subsidiary>> subsiadiarys;
    private LiveData<DetailSubsidiary> detailSubsidiary;
    private SubsidiaryRepository repository;

    public  SubsidiaryViewModel(@NonNull Application app){
        super(app);
        repository = new SubsidiaryRepository();
        subsiadiarys = repository.getAllSubsidiarys();
    }

    public LiveData<List<Subsidiary>> getSubsiadiarys() {
        return subsiadiarys;
    }

    public DetailSubsidiary getDetailSubsidiary(String subsidiaryKey){
        detailSubsidiary = repository.getDetailSubsidiary(subsidiaryKey);
        return detailSubsidiary.getValue();
    }

    public void openDetailDialog(Context ctx, DetailSubsidiary detail){
        DetailsSubsidiaryDialog dialog = DetailsSubsidiaryDialog.newInstance(detail);
        dialog.show(((AppCompatActivity)ctx).getSupportFragmentManager(), "DetailsSubsidiaryDialog");
    }
}
