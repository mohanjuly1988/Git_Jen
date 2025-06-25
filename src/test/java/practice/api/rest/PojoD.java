package practice.api.rest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_DEFAULT)
public class PojoD 
{
	
	@JsonProperty("job")
	String Occupation;
	
	@JsonProperty("name")
	String EmployeeName;
	
	@JsonProperty("id")
	String IdNumber;
	
	@JsonProperty("createdAt")
	String Time;

	
//	public String getOccupation() 
//	{
//		return Occupation;
//	}
//
//	public void setOccupation(String occupation) 
//	{
//		Occupation = occupation;
//	}
//
//	public String getEmployeeName() {
//		return EmployeeName;
//	}
//
//	public void setEmployeeName(String employeeName) {
//		EmployeeName = employeeName;
//	}
	
	

	
	
	@JsonCreator
	public PojoD(@JsonProperty("name")String EmployeeName,
			@JsonProperty("job") String Occupation)  
	{
		this.Occupation = Occupation;
		this.EmployeeName = EmployeeName;
		
	    
	}
	
	
	
	
	
}
