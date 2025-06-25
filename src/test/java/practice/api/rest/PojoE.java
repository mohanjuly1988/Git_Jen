package practice.api.rest;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PojoE 
{

	@JsonAlias({"F_name","FirstName","Fname"})
	public String First_Name;

	public String getFirst_Name() {
		return First_Name;
	}

	
	
	
	
}
