package com.myapplication.schoopwhoopassignment.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class LatestVideosModel implements Serializable {
  @SerializedName("status")
  @Expose
  private Integer status;
  @SerializedName("next_offset")
  @Expose
  private Integer nextOffset;
  @SerializedName("data")
  @Expose
  private List<Datum> data = null;
  @SerializedName("total_videos")
  @Expose
  private Integer totalVideos;
  @SerializedName("err")
  @Expose
  private String err;

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(Integer nextOffset) {
    this.nextOffset = nextOffset;
  }

  public List<Datum> getData() {
    return data;
  }

  public void setData(List<Datum> data) {
    this.data = data;
  }

  public Integer getTotalVideos() {
    return totalVideos;
  }

  public void setTotalVideos(Integer totalVideos) {
    this.totalVideos = totalVideos;
  }

  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }
}
