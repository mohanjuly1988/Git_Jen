package practice.api.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(Include.NON_DEFAULT)
@JsonPropertyOrder({"name","job"})
@JsonIgnoreProperties({"occupation","employeeName"})
public class PojoB 
{
	
	@JsonProperty("job")
	String Occupation;
	
	@JsonProperty("name")
	String EmployeeName;
	
	
	@JsonProperty("id")
	int IdNumber;
	
	@JsonProperty("createdAt")
	String Time;
	
	

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public int getIdNumber() {
		return IdNumber;
	}

	public String getTime() {
		return Time;
	}

	
	
	
	
}
