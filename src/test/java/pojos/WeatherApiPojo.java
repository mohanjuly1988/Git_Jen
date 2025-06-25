package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class WeatherApiPojo 
{

	
	private Locations location;
	
	private Currents current;

	public Locations getLocation()
	{
		return location;
	}

	public Currents getCurrent() 
	{
		return current;
	}
	
	
}
