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
 * NewbornMainDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-15T00:52:54.056+03:00[Europe/Istanbul]")public class NewbornMainDto {

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
  public NewbornMainDto id(Integer id) {
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
  public NewbornMainDto title(String title) {
    this.title = title;
    return this;
  }

  

  /**
  * Get title
  * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public NewbornMainDto question(String question) {
    this.question = question;
    return this;
  }

  

  /**
  * Get question
  * @return question
  **/
  @Schema(description = "")
  public String getQuestion() {
    return question;
  }
  public void setQuestion(String question) {
    this.question = question;
  }
  public NewbornMainDto answers(String answers) {
    this.answers = answers;
    return this;
  }

  

  /**
  * Get answers
  * @return answers
  **/
  @Schema(description = "")
  public String getAnswers() {
    return answers;
  }
  public void setAnswers(String answers) {
    this.answers = answers;
  }
  public NewbornMainDto description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * Get description
  * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public NewbornMainDto order(Integer order) {
    this.order = order;
    return this;
  }

  

  /**
  * Get order
  * @return order
  **/
  @Schema(description = "")
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
    NewbornMainDto newbornMainDto = (NewbornMainDto) o;
    return Objects.equals(this.id, newbornMainDto.id) &&
        Objects.equals(this.title, newbornMainDto.title) &&
        Objects.equals(this.question, newbornMainDto.question) &&
        Objects.equals(this.answers, newbornMainDto.answers) &&
        Objects.equals(this.description, newbornMainDto.description) &&
        Objects.equals(this.order, newbornMainDto.order);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, title, question, answers, description, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewbornMainDto {\n");
    
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
