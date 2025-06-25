package pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterPojo 
{

	
	public String email;
	
	public String password;
	
	
	@JsonCreator
	public RegisterPojo(@JsonProperty("email")String email,@JsonProperty("password")String password)
	{
		this.email=email;
		this.password=password;
	}
	
	
	
	
}
