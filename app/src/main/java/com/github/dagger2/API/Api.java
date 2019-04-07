package com.github.dagger2.API;

import com.github.dagger2.Data.Hero;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    // TODO: 07/04/19 Please provide the API url here...
    String BASE_URL = null;

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}