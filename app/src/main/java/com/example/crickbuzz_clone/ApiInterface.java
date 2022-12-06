package com.example.crickbuzz_clone;

import com.example.crickbuzz_clone.model_class.typeMatches;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ApiInterface {
    @GET("matches/v1/live")
    Call<typeMatches> getMatches(@Header("X-RapidAPI-Key") String apiKey);

    @GET("matches/v1/upcoming")
    Call<typeMatches> getMatches_upcoming(@Header("X-RapidAPI-Key") String apiKey);
}
