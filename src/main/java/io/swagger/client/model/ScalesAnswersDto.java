/*
 * ECare API
 * ECare Core Web API
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * ScalesAnswersDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-15T00:52:54.056+03:00[Europe/Istanbul]")public class ScalesAnswersDto {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("patientInformationId")
  private Long patientInformationId = null;

  @SerializedName("scaleId")
  private Integer scaleId = null;

  @SerializedName("answersOfIds")
  private String answersOfIds = null;

  @SerializedName("answersOfQuestions")
  private String answersOfQuestions = null;

  @SerializedName("createUserId")
  private Integer createUserId = null;
  public ScalesAnswersDto id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public ScalesAnswersDto patientInformationId(Long patientInformationId) {
    this.patientInformationId = patientInformationId;
    return this;
  }

  

  /**
  * Get patientInformationId
  * @return patientInformationId
  **/
  @Schema(description = "")
  public Long getPatientInformationId() {
    return patientInformationId;
  }
  public void setPatientInformationId(Long patientInformationId) {
    this.patientInformationId = patientInformationId;
  }
  public ScalesAnswersDto scaleId(Integer scaleId) {
    this.scaleId = scaleId;
    return this;
  }

  

  /**
  * Get scaleId
  * @return scaleId
  **/
  @Schema(description = "")
  public Integer getScaleId() {
    return scaleId;
  }
  public void setScaleId(Integer scaleId) {
    this.scaleId = scaleId;
  }
  public ScalesAnswersDto answersOfIds(String answersOfIds) {
    this.answersOfIds = answersOfIds;
    return this;
  }

  

  /**
  * Get answersOfIds
  * @return answersOfIds
  **/
  @Schema(description = "")
  public String getAnswersOfIds() {
    return answersOfIds;
  }
  public void setAnswersOfIds(String answersOfIds) {
    this.answersOfIds = answersOfIds;
  }
  public ScalesAnswersDto answersOfQuestions(String answersOfQuestions) {
    this.answersOfQuestions = answersOfQuestions;
    return this;
  }

  

  /**
  * Get answersOfQuestions
  * @return answersOfQuestions
  **/
  @Schema(description = "")
  public String getAnswersOfQuestions() {
    return answersOfQuestions;
  }
  public void setAnswersOfQuestions(String answersOfQuestions) {
    this.answersOfQuestions = answersOfQuestions;
  }
  public ScalesAnswersDto createUserId(Integer createUserId) {
    this.createUserId = createUserId;
    return this;
  }

  

  /**
  * Get createUserId
  * @return createUserId
  **/
  @Schema(description = "")
  public Integer getCreateUserId() {
    return createUserId;
  }
  public void setCreateUserId(Integer createUserId) {
    this.createUserId = createUserId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalesAnswersDto scalesAnswersDto = (ScalesAnswersDto) o;
    return Objects.equals(this.id, scalesAnswersDto.id) &&
        Objects.equals(this.patientInformationId, scalesAnswersDto.patientInformationId) &&
        Objects.equals(this.scaleId, scalesAnswersDto.scaleId) &&
        Objects.equals(this.answersOfIds, scalesAnswersDto.answersOfIds) &&
        Objects.equals(this.answersOfQuestions, scalesAnswersDto.answersOfQuestions) &&
        Objects.equals(this.createUserId, scalesAnswersDto.createUserId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, patientInformationId, scaleId, answersOfIds, answersOfQuestions, createUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalesAnswersDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientInformationId: ").append(toIndentedString(patientInformationId)).append("\n");
    sb.append("    scaleId: ").append(toIndentedString(scaleId)).append("\n");
    sb.append("    answersOfIds: ").append(toIndentedString(answersOfIds)).append("\n");
    sb.append("    answersOfQuestions: ").append(toIndentedString(answersOfQuestions)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
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
