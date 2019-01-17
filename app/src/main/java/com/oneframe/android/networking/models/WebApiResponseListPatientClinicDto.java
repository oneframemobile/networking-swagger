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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PatientClinicDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WebApiResponseListPatientClinicDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-17T03:14:57.423+03:00")
public class WebApiResponseListPatientClinicDto {
  @SerializedName("resultData")
  private List<PatientClinicDto> resultData = null;

  @SerializedName("resultMessage")
  private String resultMessage = null;

  @SerializedName("resultCode")
  private Integer resultCode = null;

  @SerializedName("extraInfo")
  private String extraInfo = null;

  public WebApiResponseListPatientClinicDto resultData(List<PatientClinicDto> resultData) {
    this.resultData = resultData;
    return this;
  }

  public WebApiResponseListPatientClinicDto addResultDataItem(PatientClinicDto resultDataItem) {
    if (this.resultData == null) {
      this.resultData = new ArrayList<PatientClinicDto>();
    }
    this.resultData.add(resultDataItem);
    return this;
  }

   /**
   * Get resultData
   * @return resultData
  **/
  @ApiModelProperty(value = "")
  public List<PatientClinicDto> getResultData() {
    return resultData;
  }

  public void setResultData(List<PatientClinicDto> resultData) {
    this.resultData = resultData;
  }

  public WebApiResponseListPatientClinicDto resultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
    return this;
  }

   /**
   * Get resultMessage
   * @return resultMessage
  **/
  @ApiModelProperty(value = "")
  public String getResultMessage() {
    return resultMessage;
  }

  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }

  public WebApiResponseListPatientClinicDto resultCode(Integer resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Get resultCode
   * @return resultCode
  **/
  @ApiModelProperty(value = "")
  public Integer getResultCode() {
    return resultCode;
  }

  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }

  public WebApiResponseListPatientClinicDto extraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

   /**
   * Get extraInfo
   * @return extraInfo
  **/
  @ApiModelProperty(value = "")
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
    WebApiResponseListPatientClinicDto webApiResponseListPatientClinicDto = (WebApiResponseListPatientClinicDto) o;
    return Objects.equals(this.resultData, webApiResponseListPatientClinicDto.resultData) &&
        Objects.equals(this.resultMessage, webApiResponseListPatientClinicDto.resultMessage) &&
        Objects.equals(this.resultCode, webApiResponseListPatientClinicDto.resultCode) &&
        Objects.equals(this.extraInfo, webApiResponseListPatientClinicDto.extraInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultData, resultMessage, resultCode, extraInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebApiResponseListPatientClinicDto {\n");
    
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

