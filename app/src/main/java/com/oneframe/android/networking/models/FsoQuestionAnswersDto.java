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
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * FsoQuestionAnswersDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-17T03:14:57.423+03:00")
public class FsoQuestionAnswersDto {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("question")
  private String question = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("descriptionTitle")
  private String descriptionTitle = null;

  @SerializedName("answer")
  private String answer = null;

  @SerializedName("createUserId")
  private Long createUserId = null;

  @SerializedName("patientInformationId")
  private Long patientInformationId = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  public FsoQuestionAnswersDto id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FsoQuestionAnswersDto title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FsoQuestionAnswersDto question(String question) {
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @ApiModelProperty(value = "")
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public FsoQuestionAnswersDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FsoQuestionAnswersDto descriptionTitle(String descriptionTitle) {
    this.descriptionTitle = descriptionTitle;
    return this;
  }

   /**
   * Get descriptionTitle
   * @return descriptionTitle
  **/
  @ApiModelProperty(value = "")
  public String getDescriptionTitle() {
    return descriptionTitle;
  }

  public void setDescriptionTitle(String descriptionTitle) {
    this.descriptionTitle = descriptionTitle;
  }

  public FsoQuestionAnswersDto answer(String answer) {
    this.answer = answer;
    return this;
  }

   /**
   * Get answer
   * @return answer
  **/
  @ApiModelProperty(value = "")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public FsoQuestionAnswersDto createUserId(Long createUserId) {
    this.createUserId = createUserId;
    return this;
  }

   /**
   * Get createUserId
   * @return createUserId
  **/
  @ApiModelProperty(value = "")
  public Long getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(Long createUserId) {
    this.createUserId = createUserId;
  }

  public FsoQuestionAnswersDto patientInformationId(Long patientInformationId) {
    this.patientInformationId = patientInformationId;
    return this;
  }

   /**
   * Get patientInformationId
   * @return patientInformationId
  **/
  @ApiModelProperty(value = "")
  public Long getPatientInformationId() {
    return patientInformationId;
  }

  public void setPatientInformationId(Long patientInformationId) {
    this.patientInformationId = patientInformationId;
  }

  public FsoQuestionAnswersDto createDate(OffsetDateTime createDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FsoQuestionAnswersDto fsoQuestionAnswersDto = (FsoQuestionAnswersDto) o;
    return Objects.equals(this.id, fsoQuestionAnswersDto.id) &&
        Objects.equals(this.title, fsoQuestionAnswersDto.title) &&
        Objects.equals(this.question, fsoQuestionAnswersDto.question) &&
        Objects.equals(this.description, fsoQuestionAnswersDto.description) &&
        Objects.equals(this.descriptionTitle, fsoQuestionAnswersDto.descriptionTitle) &&
        Objects.equals(this.answer, fsoQuestionAnswersDto.answer) &&
        Objects.equals(this.createUserId, fsoQuestionAnswersDto.createUserId) &&
        Objects.equals(this.patientInformationId, fsoQuestionAnswersDto.patientInformationId) &&
        Objects.equals(this.createDate, fsoQuestionAnswersDto.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, question, description, descriptionTitle, answer, createUserId, patientInformationId, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FsoQuestionAnswersDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionTitle: ").append(toIndentedString(descriptionTitle)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
    sb.append("    patientInformationId: ").append(toIndentedString(patientInformationId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

