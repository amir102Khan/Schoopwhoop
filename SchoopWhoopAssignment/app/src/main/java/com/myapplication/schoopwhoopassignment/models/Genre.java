package com.myapplication.schoopwhoopassignment.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Genre {
  @SerializedName("genre_title")
  @Expose
  private String genreTitle;
  @SerializedName("genre_slug")
  @Expose
  private String genreSlug;

  public String getGenreTitle() {
    return genreTitle;
  }

  public void setGenreTitle(String genreTitle) {
    this.genreTitle = genreTitle;
  }

  public String getGenreSlug() {
    return genreSlug;
  }

  public void setGenreSlug(String genreSlug) {
    this.genreSlug = genreSlug;
  }
}
