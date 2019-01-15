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
 * CarePlansDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-15T00:52:54.056+03:00[Europe/Istanbul]")public class CarePlansDto {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("nursingDiagnosis")
  private String nursingDiagnosis = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("nursingApplications")
  private String nursingApplications = null;
  public CarePlansDto id(Integer id) {
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
  public CarePlansDto nursingDiagnosis(String nursingDiagnosis) {
    this.nursingDiagnosis = nursingDiagnosis;
    return this;
  }

  

  /**
  * Get nursingDiagnosis
  * @return nursingDiagnosis
  **/
  @Schema(description = "")
  public String getNursingDiagnosis() {
    return nursingDiagnosis;
  }
  public void setNursingDiagnosis(String nursingDiagnosis) {
    this.nursingDiagnosis = nursingDiagnosis;
  }
  public CarePlansDto target(String target) {
    this.target = target;
    return this;
  }

  

  /**
  * Get target
  * @return target
  **/
  @Schema(description = "")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }
  public CarePlansDto nursingApplications(String nursingApplications) {
    this.nursingApplications = nursingApplications;
    return this;
  }

  

  /**
  * Get nursingApplications
  * @return nursingApplications
  **/
  @Schema(description = "")
  public String getNursingApplications() {
    return nursingApplications;
  }
  public void setNursingApplications(String nursingApplications) {
    this.nursingApplications = nursingApplications;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarePlansDto carePlansDto = (CarePlansDto) o;
    return Objects.equals(this.id, carePlansDto.id) &&
        Objects.equals(this.nursingDiagnosis, carePlansDto.nursingDiagnosis) &&
        Objects.equals(this.target, carePlansDto.target) &&
        Objects.equals(this.nursingApplications, carePlansDto.nursingApplications);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, nursingDiagnosis, target, nursingApplications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarePlansDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nursingDiagnosis: ").append(toIndentedString(nursingDiagnosis)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    nursingApplications: ").append(toIndentedString(nursingApplications)).append("\n");
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
