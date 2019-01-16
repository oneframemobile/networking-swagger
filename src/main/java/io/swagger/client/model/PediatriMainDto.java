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

/**
 * PediatriMainDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-16T03:08:05.373+03:00")
public class PediatriMainDto {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("question")
  private String question = null;

  @SerializedName("answers")
  private String answers = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("order")
  private Integer order = null;

  public PediatriMainDto id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PediatriMainDto title(String title) {
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

  public PediatriMainDto question(String question) {
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

  public PediatriMainDto answers(String answers) {
    this.answers = answers;
    return this;
  }

   /**
   * Get answers
   * @return answers
  **/
  @ApiModelProperty(value = "")
  public String getAnswers() {
    return answers;
  }

  public void setAnswers(String answers) {
    this.answers = answers;
  }

  public PediatriMainDto description(String description) {
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

  public PediatriMainDto order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PediatriMainDto pediatriMainDto = (PediatriMainDto) o;
    return Objects.equals(this.id, pediatriMainDto.id) &&
        Objects.equals(this.title, pediatriMainDto.title) &&
        Objects.equals(this.question, pediatriMainDto.question) &&
        Objects.equals(this.answers, pediatriMainDto.answers) &&
        Objects.equals(this.description, pediatriMainDto.description) &&
        Objects.equals(this.order, pediatriMainDto.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, question, answers, description, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PediatriMainDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

