package com.example.eplstanding.service;

import com.example.eplstanding.model.StandingResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StandingAPI{
    String URL_BASE = "https://api-football-standings.azharimm.site/";//Link API

    @GET("leagues/eng.1/standings")//Method mengambil data
    Call<StandingResponse> getStanding();
}

