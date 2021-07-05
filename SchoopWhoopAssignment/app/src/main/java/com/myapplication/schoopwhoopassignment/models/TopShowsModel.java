package com.myapplication.schoopwhoopassignment.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TopShowsModel {
  @SerializedName("status")
  @Expose
  private Integer status;
  @SerializedName("next_offset")
  @Expose
  private Integer nextOffset;
  @SerializedName("total_shows")
  @Expose
  private Integer totalShows;
  @SerializedName("data")
  @Expose
  private List<TopData> data = null;
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

  public Integer getTotalShows() {
    return totalShows;
  }

  public void setTotalShows(Integer totalShows) {
    this.totalShows = totalShows;
  }

  public List<TopData> getData() {
    return data;
  }

  public void setData(List<TopData> data) {
    this.data = data;
  }

  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }

  public class TopData {

    @SerializedName("feature_img_port")
    @Expose
    private String featureImgPort;
    @SerializedName("topic_name")
    @Expose
    private String topicName;
    @SerializedName("topic_feature_img")
    @Expose
    private String topicFeatureImg;
    @SerializedName("topic_feature_video")
    @Expose
    private String topicFeatureVideo;
    @SerializedName("modified_date")
    @Expose
    private String modifiedDate;
    @SerializedName("property_tags")
    @Expose
    private List<PropertyTag> propertyTags = null;
    @SerializedName("userID")
    @Expose
    private String userID;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("last_video_pub_epoch_date")
    @Expose
    private String lastVideoPubEpochDate;
    @SerializedName("feature_img_land")
    @Expose
    private String featureImgLand;
    @SerializedName("onexone_img")
    @Expose
    private String onexoneImg;
    @SerializedName("channel")
    @Expose
    private Channel channel;
    @SerializedName("updated_by")
    @Expose
    private String updatedBy;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("total_videos")
    @Expose
    private Integer totalVideos;
    @SerializedName("flag")
    @Expose
    private Integer flag;
    @SerializedName("redis_id")
    @Expose
    private String redisId;
    @SerializedName("topic_type")
    @Expose
    private List<String> topicType = null;
    @SerializedName("topic_desc")
    @Expose
    private String topicDesc;
    @SerializedName("topic_slug")
    @Expose
    private String topicSlug;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @SerializedName("_id")
    @Expose
    private String id;

    public String getFeatureImgPort() {
      return featureImgPort;
    }

    public void setFeatureImgPort(String featureImgPort) {
      this.featureImgPort = featureImgPort;
    }

    public String getTopicName() {
      return topicName;
    }

    public void setTopicName(String topicName) {
      this.topicName = topicName;
    }

    public String getTopicFeatureImg() {
      return topicFeatureImg;
    }

    public void setTopicFeatureImg(String topicFeatureImg) {
      this.topicFeatureImg = topicFeatureImg;
    }

    public String getTopicFeatureVideo() {
      return topicFeatureVideo;
    }

    public void setTopicFeatureVideo(String topicFeatureVideo) {
      this.topicFeatureVideo = topicFeatureVideo;
    }

    public String getModifiedDate() {
      return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
      this.modifiedDate = modifiedDate;
    }

    public List<PropertyTag> getPropertyTags() {
      return propertyTags;
    }

    public void setPropertyTags(List<PropertyTag> propertyTags) {
      this.propertyTags = propertyTags;
    }

    public String getUserID() {
      return userID;
    }

    public void setUserID(String userID) {
      this.userID = userID;
    }

    public Integer getPriority() {
      return priority;
    }

    public void setPriority(Integer priority) {
      this.priority = priority;
    }

    public String getLastVideoPubEpochDate() {
      return lastVideoPubEpochDate;
    }

    public void setLastVideoPubEpochDate(String lastVideoPubEpochDate) {
      this.lastVideoPubEpochDate = lastVideoPubEpochDate;
    }

    public String getFeatureImgLand() {
      return featureImgLand;
    }

    public void setFeatureImgLand(String featureImgLand) {
      this.featureImgLand = featureImgLand;
    }

    public String getOnexoneImg() {
      return onexoneImg;
    }

    public void setOnexoneImg(String onexoneImg) {
      this.onexoneImg = onexoneImg;
    }

    public Channel getChannel() {
      return channel;
    }

    public void setChannel(Channel channel) {
      this.channel = channel;
    }

    public String getUpdatedBy() {
      return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
      this.updatedBy = updatedBy;
    }

    public List<String> getTags() {
      return tags;
    }

    public void setTags(List<String> tags) {
      this.tags = tags;
    }

    public Integer getTotalVideos() {
      return totalVideos;
    }

    public void setTotalVideos(Integer totalVideos) {
      this.totalVideos = totalVideos;
    }

    public Integer getFlag() {
      return flag;
    }

    public void setFlag(Integer flag) {
      this.flag = flag;
    }

    public String getRedisId() {
      return redisId;
    }

    public void setRedisId(String redisId) {
      this.redisId = redisId;
    }

    public List<String> getTopicType() {
      return topicType;
    }

    public void setTopicType(List<String> topicType) {
      this.topicType = topicType;
    }

    public String getTopicDesc() {
      return topicDesc;
    }

    public void setTopicDesc(String topicDesc) {
      this.topicDesc = topicDesc;
    }

    public String getTopicSlug() {
      return topicSlug;
    }

    public void setTopicSlug(String topicSlug) {
      this.topicSlug = topicSlug;
    }

    public String getCreatedDate() {
      return createdDate;
    }

    public void setCreatedDate(String createdDate) {
      this.createdDate = createdDate;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

  }

  public class Channel {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getSlug() {
      return slug;
    }

    public void setSlug(String slug) {
      this.slug = slug;
    }

  }

  public class PropertyTag {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("show")
    @Expose
    private Boolean show;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("tag")
    @Expose
    private String tag;
    @SerializedName("feature_img")
    @Expose
    private String featureImg;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public Boolean getShow() {
      return show;
    }

    public void setShow(Boolean show) {
      this.show = show;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getTag() {
      return tag;
    }

    public void setTag(String tag) {
      this.tag = tag;
    }

    public String getFeatureImg() {
      return featureImg;
    }

    public void setFeatureImg(String featureImg) {
      this.featureImg = featureImg;
    }

    public Integer getOrder() {
      return order;
    }

    public void setOrder(Integer order) {
      this.order = order;
    }

    public List<String> getTags() {
      return tags;
    }

    public void setTags(List<String> tags) {
      this.tags = tags;
    }
  }
}
