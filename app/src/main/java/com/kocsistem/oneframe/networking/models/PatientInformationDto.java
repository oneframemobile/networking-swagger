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
 * PatientInformationDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-16T12:09:11.579+03:00")
public class PatientInformationDto {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("age")
  private String age = null;

  @SerializedName("process")
  private String process = null;

  @SerializedName("gender")
  private byte[] gender = null;

  @SerializedName("student")
  private String student = null;

  @SerializedName("clinic")
  private String clinic = null;

  @SerializedName("diseases")
  private String diseases = null;

  @SerializedName("chronicDiseases")
  private String chronicDiseases = null;

  @SerializedName("invasiveProcedure")
  private String invasiveProcedure = null;

  @SerializedName("drugType")
  private String drugType = null;

  @SerializedName("createUserId")
  private Long createUserId = null;

  @SerializedName("creationTime")
  private OffsetDateTime creationTime = null;

  @SerializedName("lastModificationTime")
  private OffsetDateTime lastModificationTime = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("ageGroup")
  private String ageGroup = null;

  public PatientInformationDto id(Long id) {
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

  public PatientInformationDto name(String name) {
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

  public PatientInformationDto email(String email) {
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

  public PatientInformationDto phone(String phone) {
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

  public PatientInformationDto location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PatientInformationDto age(String age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(value = "")
  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public PatientInformationDto process(String process) {
    this.process = process;
    return this;
  }

   /**
   * Get process
   * @return process
  **/
  @ApiModelProperty(value = "")
  public String getProcess() {
    return process;
  }

  public void setProcess(String process) {
    this.process = process;
  }

  public PatientInformationDto gender(byte[] gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public byte[] getGender() {
    return gender;
  }

  public void setGender(byte[] gender) {
    this.gender = gender;
  }

  public PatientInformationDto student(String student) {
    this.student = student;
    return this;
  }

   /**
   * Get student
   * @return student
  **/
  @ApiModelProperty(value = "")
  public String getStudent() {
    return student;
  }

  public void setStudent(String student) {
    this.student = student;
  }

  public PatientInformationDto clinic(String clinic) {
    this.clinic = clinic;
    return this;
  }

   /**
   * Get clinic
   * @return clinic
  **/
  @ApiModelProperty(value = "")
  public String getClinic() {
    return clinic;
  }

  public void setClinic(String clinic) {
    this.clinic = clinic;
  }

  public PatientInformationDto diseases(String diseases) {
    this.diseases = diseases;
    return this;
  }

   /**
   * Get diseases
   * @return diseases
  **/
  @ApiModelProperty(value = "")
  public String getDiseases() {
    return diseases;
  }

  public void setDiseases(String diseases) {
    this.diseases = diseases;
  }

  public PatientInformationDto chronicDiseases(String chronicDiseases) {
    this.chronicDiseases = chronicDiseases;
    return this;
  }

   /**
   * Get chronicDiseases
   * @return chronicDiseases
  **/
  @ApiModelProperty(value = "")
  public String getChronicDiseases() {
    return chronicDiseases;
  }

  public void setChronicDiseases(String chronicDiseases) {
    this.chronicDiseases = chronicDiseases;
  }

  public PatientInformationDto invasiveProcedure(String invasiveProcedure) {
    this.invasiveProcedure = invasiveProcedure;
    return this;
  }

   /**
   * Get invasiveProcedure
   * @return invasiveProcedure
  **/
  @ApiModelProperty(value = "")
  public String getInvasiveProcedure() {
    return invasiveProcedure;
  }

  public void setInvasiveProcedure(String invasiveProcedure) {
    this.invasiveProcedure = invasiveProcedure;
  }

  public PatientInformationDto drugType(String drugType) {
    this.drugType = drugType;
    return this;
  }

   /**
   * Get drugType
   * @return drugType
  **/
  @ApiModelProperty(value = "")
  public String getDrugType() {
    return drugType;
  }

  public void setDrugType(String drugType) {
    this.drugType = drugType;
  }

  public PatientInformationDto createUserId(Long createUserId) {
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

  public PatientInformationDto creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public PatientInformationDto lastModificationTime(OffsetDateTime lastModificationTime) {
    this.lastModificationTime = lastModificationTime;
    return this;
  }

   /**
   * Get lastModificationTime
   * @return lastModificationTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModificationTime() {
    return lastModificationTime;
  }

  public void setLastModificationTime(OffsetDateTime lastModificationTime) {
    this.lastModificationTime = lastModificationTime;
  }

  public PatientInformationDto operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public PatientInformationDto ageGroup(String ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

   /**
   * Get ageGroup
   * @return ageGroup
  **/
  @ApiModelProperty(value = "")
  public String getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientInformationDto patientInformationDto = (PatientInformationDto) o;
    return Objects.equals(this.id, patientInformationDto.id) &&
        Objects.equals(this.name, patientInformationDto.name) &&
        Objects.equals(this.email, patientInformationDto.email) &&
        Objects.equals(this.phone, patientInformationDto.phone) &&
        Objects.equals(this.location, patientInformationDto.location) &&
        Objects.equals(this.age, patientInformationDto.age) &&
        Objects.equals(this.process, patientInformationDto.process) &&
        Arrays.equals(this.gender, patientInformationDto.gender) &&
        Objects.equals(this.student, patientInformationDto.student) &&
        Objects.equals(this.clinic, patientInformationDto.clinic) &&
        Objects.equals(this.diseases, patientInformationDto.diseases) &&
        Objects.equals(this.chronicDiseases, patientInformationDto.chronicDiseases) &&
        Objects.equals(this.invasiveProcedure, patientInformationDto.invasiveProcedure) &&
        Objects.equals(this.drugType, patientInformationDto.drugType) &&
        Objects.equals(this.createUserId, patientInformationDto.createUserId) &&
        Objects.equals(this.creationTime, patientInformationDto.creationTime) &&
        Objects.equals(this.lastModificationTime, patientInformationDto.lastModificationTime) &&
        Objects.equals(this.operation, patientInformationDto.operation) &&
        Objects.equals(this.ageGroup, patientInformationDto.ageGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, phone, location, age, process, Arrays.hashCode(gender), student, clinic, diseases, chronicDiseases, invasiveProcedure, drugType, createUserId, creationTime, lastModificationTime, operation, ageGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientInformationDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    clinic: ").append(toIndentedString(clinic)).append("\n");
    sb.append("    diseases: ").append(toIndentedString(diseases)).append("\n");
    sb.append("    chronicDiseases: ").append(toIndentedString(chronicDiseases)).append("\n");
    sb.append("    invasiveProcedure: ").append(toIndentedString(invasiveProcedure)).append("\n");
    sb.append("    drugType: ").append(toIndentedString(drugType)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    lastModificationTime: ").append(toIndentedString(lastModificationTime)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    ageGroup: ").append(toIndentedString(ageGroup)).append("\n");
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

