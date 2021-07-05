package com.myapplication.schoopwhoopassignment.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class PremiumModel {
  @SerializedName("status")
  @Expose
  private Integer status;
  @SerializedName("total")
  @Expose
  private Integer total;
  @SerializedName("data")
  @Expose
  private List<PremiumData> data = null;
  @SerializedName("err")
  @Expose
  private String err;

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public List<PremiumData> getData() {
    return data;
  }

  public void setData(List<PremiumData> data) {
    this.data = data;
  }

  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }

  public class PremiumData {

    @SerializedName("cast_crew")
    @Expose
    private List<Object> castCrew = null;
    @SerializedName("sh_heading")
    @Expose
    private String shHeading;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("new_tags")
    @Expose
    private List<NewTag> newTags = null;
    @SerializedName("onexone_img")
    @Expose
    private String onexoneImg;
    @SerializedName("show")
    @Expose
    private Show show;
    @SerializedName("genres")
    @Expose
    private List<Genre> genres = null;
    @SerializedName("video_thumbnail_2x3")
    @Expose
    private String videoThumbnail2x3;
    @SerializedName("aspect_ratio")
    @Expose
    private String aspectRatio;
    @SerializedName("nsfw")
    @Expose
    private Integer nsfw;
    @SerializedName("feature_img")
    @Expose
    private String featureImg;
    @SerializedName("video_thumbnail_16x9")
    @Expose
    private String videoThumbnail16x9;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("premium")
    @Expose
    private Boolean premium;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("pub_date")
    @Expose
    private String pubDate;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("video_thumbnail_9x16")
    @Expose
    private String videoThumbnail9x16;

    public List<Object> getCastCrew() {
      return castCrew;
    }

    public void setCastCrew(List<Object> castCrew) {
      this.castCrew = castCrew;
    }

    public String getShHeading() {
      return shHeading;
    }

    public void setShHeading(String shHeading) {
      this.shHeading = shHeading;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public List<NewTag> getNewTags() {
      return newTags;
    }

    public void setNewTags(List<NewTag> newTags) {
      this.newTags = newTags;
    }

    public String getOnexoneImg() {
      return onexoneImg;
    }

    public void setOnexoneImg(String onexoneImg) {
      this.onexoneImg = onexoneImg;
    }

    public Show getShow() {
      return show;
    }

    public void setShow(Show show) {
      this.show = show;
    }

    public List<Genre> getGenres() {
      return genres;
    }

    public void setGenres(List<Genre> genres) {
      this.genres = genres;
    }

    public String getVideoThumbnail2x3() {
      return videoThumbnail2x3;
    }

    public void setVideoThumbnail2x3(String videoThumbnail2x3) {
      this.videoThumbnail2x3 = videoThumbnail2x3;
    }

    public String getAspectRatio() {
      return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
      this.aspectRatio = aspectRatio;
    }

    public Integer getNsfw() {
      return nsfw;
    }

    public void setNsfw(Integer nsfw) {
      this.nsfw = nsfw;
    }

    public String getFeatureImg() {
      return featureImg;
    }

    public void setFeatureImg(String featureImg) {
      this.featureImg = featureImg;
    }

    public String getVideoThumbnail16x9() {
      return videoThumbnail16x9;
    }

    public void setVideoThumbnail16x9(String videoThumbnail16x9) {
      this.videoThumbnail16x9 = videoThumbnail16x9;
    }

    public String getDuration() {
      return duration;
    }

    public void setDuration(String duration) {
      this.duration = duration;
    }

    public Boolean getPremium() {
      return premium;
    }

    public void setPremium(Boolean premium) {
      this.premium = premium;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getPubDate() {
      return pubDate;
    }

    public void setPubDate(String pubDate) {
      this.pubDate = pubDate;
    }

    public String getSlug() {
      return slug;
    }

    public void setSlug(String slug) {
      this.slug = slug;
    }

    public List<String> getTags() {
      return tags;
    }

    public void setTags(List<String> tags) {
      this.tags = tags;
    }

    public String getVideoThumbnail9x16() {
      return videoThumbnail9x16;
    }

    public void setVideoThumbnail9x16(String videoThumbnail9x16) {
      this.videoThumbnail9x16 = videoThumbnail9x16;
    }

  }


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

}
