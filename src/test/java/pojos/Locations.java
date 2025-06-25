package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Locations 
{

	private String name;
	
	private String country;

	public String getName() 
	{
		return name;
	}

	public String getCountry() 
	{
		return country;
	}
	
	
}
