package practice.api.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PojoC 
{
	
	@JsonProperty("email")
	String Emailid;
	
	@JsonProperty("password")
	String Password;
	
	@JsonProperty("token")
	String TokenResponse;

	public String getEmailid() 
	{
		return Emailid;
	}

	public void setEmailid(String emailid) 
	{
		Emailid = emailid;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getTokenResponse() {
		return TokenResponse;
	}

}
