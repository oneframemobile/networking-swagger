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
 * UserRegisterDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-17T00:46:55.050+03:00")
public class UserRegisterDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("surname")
  private String surname = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("rePassword")
  private String rePassword = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("facebookUserId")
  private String facebookUserId = null;

  @SerializedName("facebookToken")
  private String facebookToken = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  public UserRegisterDto name(String name) {
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

  public UserRegisterDto surname(String surname) {
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

  public UserRegisterDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserRegisterDto userName(String userName) {
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

  public UserRegisterDto password(String password) {
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

  public UserRegisterDto rePassword(String rePassword) {
    this.rePassword = rePassword;
    return this;
  }

   /**
   * Get rePassword
   * @return rePassword
  **/
  @ApiModelProperty(value = "")
  public String getRePassword() {
    return rePassword;
  }

  public void setRePassword(String rePassword) {
    this.rePassword = rePassword;
  }

  public UserRegisterDto phone(String phone) {
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

  public UserRegisterDto facebookUserId(String facebookUserId) {
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

  public UserRegisterDto facebookToken(String facebookToken) {
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

  public UserRegisterDto deviceId(String deviceId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRegisterDto userRegisterDto = (UserRegisterDto) o;
    return Objects.equals(this.name, userRegisterDto.name) &&
        Objects.equals(this.surname, userRegisterDto.surname) &&
        Objects.equals(this.email, userRegisterDto.email) &&
        Objects.equals(this.userName, userRegisterDto.userName) &&
        Objects.equals(this.password, userRegisterDto.password) &&
        Objects.equals(this.rePassword, userRegisterDto.rePassword) &&
        Objects.equals(this.phone, userRegisterDto.phone) &&
        Objects.equals(this.facebookUserId, userRegisterDto.facebookUserId) &&
        Objects.equals(this.facebookToken, userRegisterDto.facebookToken) &&
        Objects.equals(this.deviceId, userRegisterDto.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname, email, userName, password, rePassword, phone, facebookUserId, facebookToken, deviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRegisterDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rePassword: ").append(toIndentedString(rePassword)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    facebookUserId: ").append(toIndentedString(facebookUserId)).append("\n");
    sb.append("    facebookToken: ").append(toIndentedString(facebookToken)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

