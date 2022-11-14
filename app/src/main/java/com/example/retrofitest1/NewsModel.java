package com.example.retrofitest1;


import android.util.Log;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsModel {
    public static void getNews(String key, String l) {
        APi api = Network.getInstance().getApi();
        Call<ResponseBody> news = api.getNews(key, l);
        news.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                //   Log.i("NewsModel-------------------------------------：", "onResponse:  status =" + status);

                try {
                    Log.i("正确-------------------------------------：", "onResponse:   " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.i("错误", "onResponse:   =" + t.getMessage());

            }
        });

    }
}
