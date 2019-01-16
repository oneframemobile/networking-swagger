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
 * UserLoginResultDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-16T02:53:50.763+03:00")
public class UserLoginResultDto {
  @SerializedName("userId")
  private Long userId = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("surname")
  private String surname = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("facebookUserId")
  private String facebookUserId = null;

  @SerializedName("facebookToken")
  private String facebookToken = null;

  @SerializedName("isFacebookUser")
  private Boolean isFacebookUser = null;

  public UserLoginResultDto userId(Long userId) {
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

  public UserLoginResultDto userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserLoginResultDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserLoginResultDto surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(value = "")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public UserLoginResultDto emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UserLoginResultDto phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserLoginResultDto password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserLoginResultDto facebookUserId(String facebookUserId) {
    this.facebookUserId = facebookUserId;
    return this;
  }

   /**
   * Get facebookUserId
   * @return facebookUserId
  **/
  @ApiModelProperty(value = "")
  public String getFacebookUserId() {
    return facebookUserId;
  }

  public void setFacebookUserId(String facebookUserId) {
    this.facebookUserId = facebookUserId;
  }

  public UserLoginResultDto facebookToken(String facebookToken) {
    this.facebookToken = facebookToken;
    return this;
  }

   /**
   * Get facebookToken
   * @return facebookToken
  **/
  @ApiModelProperty(value = "")
  public String getFacebookToken() {
    return facebookToken;
  }

  public void setFacebookToken(String facebookToken) {
    this.facebookToken = facebookToken;
  }

  public UserLoginResultDto isFacebookUser(Boolean isFacebookUser) {
    this.isFacebookUser = isFacebookUser;
    return this;
  }

   /**
   * Get isFacebookUser
   * @return isFacebookUser
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFacebookUser() {
    return isFacebookUser;
  }

  public void setIsFacebookUser(Boolean isFacebookUser) {
    this.isFacebookUser = isFacebookUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLoginResultDto userLoginResultDto = (UserLoginResultDto) o;
    return Objects.equals(this.userId, userLoginResultDto.userId) &&
        Objects.equals(this.userName, userLoginResultDto.userName) &&
        Objects.equals(this.name, userLoginResultDto.name) &&
        Objects.equals(this.surname, userLoginResultDto.surname) &&
        Objects.equals(this.emailAddress, userLoginResultDto.emailAddress) &&
        Objects.equals(this.phone, userLoginResultDto.phone) &&
        Objects.equals(this.password, userLoginResultDto.password) &&
        Objects.equals(this.facebookUserId, userLoginResultDto.facebookUserId) &&
        Objects.equals(this.facebookToken, userLoginResultDto.facebookToken) &&
        Objects.equals(this.isFacebookUser, userLoginResultDto.isFacebookUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, name, surname, emailAddress, phone, password, facebookUserId, facebookToken, isFacebookUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLoginResultDto {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    facebookUserId: ").append(toIndentedString(facebookUserId)).append("\n");
    sb.append("    facebookToken: ").append(toIndentedString(facebookToken)).append("\n");
    sb.append("    isFacebookUser: ").append(toIndentedString(isFacebookUser)).append("\n");
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

