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
 * UserCreditTransactionsDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-16T22:07:52.192+03:00")
public class UserCreditTransactionsDto {
  @SerializedName("credit")
  private Double credit = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("userId")
  private Long userId = null;

  @SerializedName("transactionDate")
  private OffsetDateTime transactionDate = null;

  @SerializedName("isInserted")
  private Boolean isInserted = null;

  @SerializedName("description")
  private String description = null;

  public UserCreditTransactionsDto credit(Double credit) {
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @ApiModelProperty(value = "")
  public Double getCredit() {
    return credit;
  }

  public void setCredit(Double credit) {
    this.credit = credit;
  }

  public UserCreditTransactionsDto id(Integer id) {
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

  public UserCreditTransactionsDto userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public UserCreditTransactionsDto transactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
  }

  public UserCreditTransactionsDto isInserted(Boolean isInserted) {
    this.isInserted = isInserted;
    return this;
  }

   /**
   * Get isInserted
   * @return isInserted
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsInserted() {
    return isInserted;
  }

  public void setIsInserted(Boolean isInserted) {
    this.isInserted = isInserted;
  }

  public UserCreditTransactionsDto description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreditTransactionsDto userCreditTransactionsDto = (UserCreditTransactionsDto) o;
    return Objects.equals(this.credit, userCreditTransactionsDto.credit) &&
        Objects.equals(this.id, userCreditTransactionsDto.id) &&
        Objects.equals(this.userId, userCreditTransactionsDto.userId) &&
        Objects.equals(this.transactionDate, userCreditTransactionsDto.transactionDate) &&
        Objects.equals(this.isInserted, userCreditTransactionsDto.isInserted) &&
        Objects.equals(this.description, userCreditTransactionsDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credit, id, userId, transactionDate, isInserted, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreditTransactionsDto {\n");
    
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    isInserted: ").append(toIndentedString(isInserted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

