package pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

//@JsonInclude(Include.NON_NULL)
public class LoginResponsePojo 
{
	@JsonProperty("email")
	public String MyID;
	
	@JsonProperty("password")
	public String MySecret;
	
	//public String Name;
	
	public String Acknowledgment;
	
	public String getAcknowledgment() {
		return Acknowledgment;
	}

	@JsonSetter("token")
	public void setAcknowledgment(String acknowledgment) 
	{
		Acknowledgment = acknowledgment;
	}

	@JsonCreator
	public LoginResponsePojo(@JsonProperty("email")String MyID,@JsonProperty("password")String MySecret)
	{
		this.MyID = MyID;
		this.MySecret = MySecret;
	}

}
