package pojos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryPojo 
{
	@JsonProperty("name")
	private NamePojo name;
	
	@JsonProperty("capital")
	private List<String> capital;

	public NamePojo getName() {
		return name;
	}

	public List<String> getCapital() {
		return capital;
	}
	
}
