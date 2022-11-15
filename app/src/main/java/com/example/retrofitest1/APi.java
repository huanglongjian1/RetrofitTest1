package com.example.retrofitest1;

import java.util.List;


import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APi {
    // @Headers({"apikey:81bf9da930c7f9825a3c3383f1d8d766", "Content-Type:application/json"})
    @GET("s6/weather/now")
    Observable<JavaBean> getNews(@Query("key") String key, @Query("location") String city);

}


