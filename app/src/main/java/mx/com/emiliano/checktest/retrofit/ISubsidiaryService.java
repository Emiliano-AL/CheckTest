package mx.com.emiliano.checktest.retrofit;

import java.util.List;

import mx.com.emiliano.checktest.retrofit.response.ResultSubsidiary;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ISubsidiaryService {
    @GET("v4/subsidiary")
    Call<ResultSubsidiary> getSubsidiarys();

    @GET("/users")
    Call<List<String>> getAllUsers();
}
