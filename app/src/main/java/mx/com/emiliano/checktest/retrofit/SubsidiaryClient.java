package mx.com.emiliano.checktest.retrofit;

import mx.com.emiliano.checktest.common.Const;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SubsidiaryClient {
//    private static SubsidiaryClient instance = null;
//    private ISubsidiaryService iSubsidiaryService;
    private static Retrofit retrofit;

    public static Retrofit getRetrofitSubsidiaryInstance(){
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit
                    .Builder()
                    .baseUrl(Const.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


//    public <S> S createService(Class<S> serviceClass){
//        return retrofit.create(serviceClass);
//    }
}
