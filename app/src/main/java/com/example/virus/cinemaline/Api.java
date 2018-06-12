package com.example.virus.cinemaline;


import com.example.virus.cinemaline.model.MainFeed;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {
    String BASE_URL = "https://kinoafisha.ua/ajax/";

    @GET("kinoafisha_load")
    Call<MainFeed> getMovies();
}
