package com.myapplication.schoopwhoopassignment.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Show {

  @SerializedName("topic")
  @Expose
  private String topic;
  @SerializedName("feature_img_port")
  @Expose
  private String featureImgPort;
  @SerializedName("topic_feature_img")
  @Expose
  private String topicFeatureImg;
  @SerializedName("feature_img_land")
  @Expose
  private String featureImgLand;
  @SerializedName("topic_display")
  @Expose
  private TopicDisplay topicDisplay;

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getFeatureImgPort() {
    return featureImgPort;
  }

  public void setFeatureImgPort(String featureImgPort) {
    this.featureImgPort = featureImgPort;
  }

  public String getTopicFeatureImg() {
    return topicFeatureImg;
  }

  public void setTopicFeatureImg(String topicFeatureImg) {
    this.topicFeatureImg = topicFeatureImg;
  }

  public String getFeatureImgLand() {
    return featureImgLand;
  }

  public void setFeatureImgLand(String featureImgLand) {
    this.featureImgLand = featureImgLand;
  }

  public TopicDisplay getTopicDisplay() {
    return topicDisplay;
  }

  public void setTopicDisplay(TopicDisplay topicDisplay) {
    this.topicDisplay = topicDisplay;
  }

}
