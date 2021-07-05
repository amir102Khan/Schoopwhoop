package com.myapplication.schoopwhoopassignment.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewTag {

  @SerializedName("id")
  @Expose
  private String id;
  @SerializedName("flag")
  @Expose
  private Integer flag;
  @SerializedName("title")
  @Expose
  private String title;
  @SerializedName("tag_slug")
  @Expose
  private String tagSlug;
  @SerializedName("tag_type")
  @Expose
  private String tagType;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTagSlug() {
    return tagSlug;
  }

  public void setTagSlug(String tagSlug) {
    this.tagSlug = tagSlug;
  }

  public String getTagType() {
    return tagType;
  }

  public void setTagType(String tagType) {
    this.tagType = tagType;
  }

}
