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


package com.oneframe.android.networking.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.oneframe.android.networking.models.FsoQuestionAnswersDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WebApiResponseListFsoQuestionAnswersDto
 */
public class WebApiResponseListFsoQuestionAnswersDto {
  @SerializedName("resultData")
  private List<FsoQuestionAnswersDto> resultData = null;

  @SerializedName("resultMessage")
  private String resultMessage = null;

  @SerializedName("resultCode")
  private Integer resultCode = null;

  @SerializedName("extraInfo")
  private String extraInfo = null;

  public WebApiResponseListFsoQuestionAnswersDto resultData(List<FsoQuestionAnswersDto> resultData) {
    this.resultData = resultData;
    return this;
  }

  public WebApiResponseListFsoQuestionAnswersDto addResultDataItem(FsoQuestionAnswersDto resultDataItem) {
    if (this.resultData == null) {
      this.resultData = new ArrayList<FsoQuestionAnswersDto>();
    }
    this.resultData.add(resultDataItem);
    return this;
  }

   /**
   * Get resultData
   * @return resultData
  **/
  public List<FsoQuestionAnswersDto> getResultData() {
    return resultData;
  }

  public void setResultData(List<FsoQuestionAnswersDto> resultData) {
    this.resultData = resultData;
  }

  public WebApiResponseListFsoQuestionAnswersDto resultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
    return this;
  }

   /**
   * Get resultMessage
   * @return resultMessage
  **/
  public String getResultMessage() {
    return resultMessage;
  }

  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }

  public WebApiResponseListFsoQuestionAnswersDto resultCode(Integer resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Get resultCode
   * @return resultCode
  **/
  public Integer getResultCode() {
    return resultCode;
  }

  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }

  public WebApiResponseListFsoQuestionAnswersDto extraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

   /**
   * Get extraInfo
   * @return extraInfo
  **/
  public String getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebApiResponseListFsoQuestionAnswersDto webApiResponseListFsoQuestionAnswersDto = (WebApiResponseListFsoQuestionAnswersDto) o;
    return Objects.equals(this.resultData, webApiResponseListFsoQuestionAnswersDto.resultData) &&
        Objects.equals(this.resultMessage, webApiResponseListFsoQuestionAnswersDto.resultMessage) &&
        Objects.equals(this.resultCode, webApiResponseListFsoQuestionAnswersDto.resultCode) &&
        Objects.equals(this.extraInfo, webApiResponseListFsoQuestionAnswersDto.extraInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultData, resultMessage, resultCode, extraInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebApiResponseListFsoQuestionAnswersDto {\n");
    
    sb.append("    resultData: ").append(toIndentedString(resultData)).append("\n");
    sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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

