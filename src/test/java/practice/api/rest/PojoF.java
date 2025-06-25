package practice.api.rest;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PojoF 
{

	@JsonProperty("data")
	public User Data;

	public User getData() 
	{
		return Data;
	}
	
	@JsonProperty("support")
	public User Support;
	
	public User getSupport()
	{
		return Support;
	}
    
    
	
}
