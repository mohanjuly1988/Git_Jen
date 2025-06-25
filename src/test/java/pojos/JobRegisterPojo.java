package pojos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonInclude(Include.NON_DEFAULT)
//@JsonIgnoreProperties(ignoreUnknown=true)
public class JobRegisterPojo 
{
	
	@JsonIgnore
	public String customerName;
	
	@JsonIgnore
	public String occupation;
	
	@JsonIgnore
	public int employeeId;

	@JsonProperty("name")
	public String CustomerName;
	
	@JsonProperty("job")
	public String Occupation;
	
	@JsonProperty("id")
	public int EmployeeId;
	
	public Date TimeStamp;
	
	public String getCustomerName() 
	{
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	
	public Date getTimeStamp() {
		return TimeStamp;
	}
	
	@JsonSetter("createdAt")
	public void setTimeStamp(Date timeStamp) {
		TimeStamp = timeStamp;
	}
	
	
}
