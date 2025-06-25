package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Currents 
{

	@JsonProperty("temp_c")
	private int Celsius;
	
	@JsonProperty("temp_f")
	private double Fahrenheit;
	
	
	

	public int getCelsius() 
	{
		return Celsius;
	}

	public double getFahrenheit() 
	{
		return Fahrenheit;
	}
	
	
private int last_updated_epoch;
	
	private String last_updated;
	
	private int is_day;
	
	private Cond condition;




	public int getLast_updated_epoch() {
		return last_updated_epoch;
	}

	public String getLast_updated() {
		return last_updated;
	}

	public int getIs_day() {
		return is_day;
	}

	public Cond getCondition() {
		return condition;
	}
	
	
}
