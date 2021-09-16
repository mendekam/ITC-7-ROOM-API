package com.example.eplstanding.service;

import com.example.eplstanding.model.StandingResponse;
import com.example.eplstanding.model.StandingsItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StandingService {
    // inisialisasi Retrofit
    private Retrofit retrofit = null;


    public StandingAPI getAPI(){
        if (retrofit == null){
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(StandingAPI.URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(StandingAPI.class);
    }

    public void getStanding(final StandingListener<List<StandingsItem>> listener){
        getAPI().getStanding().enqueue(new Callback<StandingResponse>() {
            @Override
            public void onResponse(Call<StandingResponse> call, Response<StandingResponse> response) {
                StandingResponse data = response.body();

                if (data != null && data.getData() != null ){
                    listener.onSuccess(data.getData().getStandings());
                }
            }

            @Override
            public void onFailure(Call<StandingResponse> call, Throwable t) {
                listener.onFailed(t.getMessage());
            }
        });
    }
}

