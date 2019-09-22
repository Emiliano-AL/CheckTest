package mx.com.emiliano.checktest.retrofit;

import java.util.List;

import mx.com.emiliano.checktest.retrofit.response.DetailSubsidiary;
import mx.com.emiliano.checktest.retrofit.response.ResultSubsidiary;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ISubsidiaryService {
    @GET("v4/subsidiary")
    Call<ResultSubsidiary> getSubsidiarys();

    @GET("v4/subsidiary/{subsidiaryKey}")
    Call<DetailSubsidiary> getSubsidiaryDetail(@Path("subsidiaryKey") String subsidiaryKey);
}
