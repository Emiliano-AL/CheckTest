package mx.com.emiliano.checktest.data;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import mx.com.emiliano.checktest.retrofit.response.ResultSubsidiary;
import mx.com.emiliano.checktest.retrofit.response.Subsidiary;

public class SubsidiaryViewModel extends AndroidViewModel {
    private LiveData<List<Subsidiary>> subsiadiarys;
    private SubsidiaryRepository repository;

    public  SubsidiaryViewModel(@NonNull Application app){
        super(app);
        repository = new SubsidiaryRepository();
        subsiadiarys = repository.getAllSubsidiarys();
    }

    public LiveData<List<Subsidiary>> getSubsiadiarys() {
        return subsiadiarys;
    }
}
