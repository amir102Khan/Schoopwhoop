package com.myapplication.schoopwhoopassignment.interfaces;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

  @GET("videos/?filter_type=carousel")
  Call<ResponseBody> getPremiumVideos();

  @GET("videos/")
  Call<ResponseBody> getLatestVideos();

  @GET("videos/?filter_type=uns_edpicks")
  Call<ResponseBody> getEditorsChoiceVideos();

  @GET("all_shows/")
  Call<ResponseBody> getTopShows();


}
