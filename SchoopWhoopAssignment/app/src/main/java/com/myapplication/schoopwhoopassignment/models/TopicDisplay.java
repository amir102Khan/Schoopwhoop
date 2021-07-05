package com.myapplication.schoopwhoopassignment.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopicDisplay {
  @SerializedName("topic_slug")
  @Expose
  private String topicSlug;
  @SerializedName("topic_display")
  @Expose
  private String topicDisplay;

  public String getTopicSlug() {
    return topicSlug;
  }

  public void setTopicSlug(String topicSlug) {
    this.topicSlug = topicSlug;
  }

  public String getTopicDisplay() {
    return topicDisplay;
  }

  public void setTopicDisplay(String topicDisplay) {
    this.topicDisplay = topicDisplay;
  }

}
