/*
 * ECare API
 * ECare Core Web API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kocsistem.oneframe.networking.models

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ApiRegisterRequestDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-17T00:48:19.920+03:00")
public class ApiRegisterRequestDto {
  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("expireDate")
  private OffsetDateTime expireDate = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("deviceToken")
  private String deviceToken = null;

  @SerializedName("os")
  private String os = null;

  @SerializedName("deviceModel")
  private String deviceModel = null;

  @SerializedName("appVersion")
  private String appVersion = null;

  public ApiRegisterRequestDto deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @ApiModelProperty(value = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public ApiRegisterRequestDto expireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
  }

  public ApiRegisterRequestDto createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public ApiRegisterRequestDto deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }

   /**
   * Get deviceToken
   * @return deviceToken
  **/
  @ApiModelProperty(value = "")
  public String getDeviceToken() {
    return deviceToken;
  }

  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  public ApiRegisterRequestDto os(String os) {
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @ApiModelProperty(value = "")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public ApiRegisterRequestDto deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * Get deviceModel
   * @return deviceModel
  **/
  @ApiModelProperty(value = "")
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public ApiRegisterRequestDto appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * Get appVersion
   * @return appVersion
  **/
  @ApiModelProperty(value = "")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRegisterRequestDto apiRegisterRequestDto = (ApiRegisterRequestDto) o;
    return Objects.equals(this.deviceId, apiRegisterRequestDto.deviceId) &&
        Objects.equals(this.expireDate, apiRegisterRequestDto.expireDate) &&
        Objects.equals(this.createDate, apiRegisterRequestDto.createDate) &&
        Objects.equals(this.deviceToken, apiRegisterRequestDto.deviceToken) &&
        Objects.equals(this.os, apiRegisterRequestDto.os) &&
        Objects.equals(this.deviceModel, apiRegisterRequestDto.deviceModel) &&
        Objects.equals(this.appVersion, apiRegisterRequestDto.appVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, expireDate, createDate, deviceToken, os, deviceModel, appVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRegisterRequestDto {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

