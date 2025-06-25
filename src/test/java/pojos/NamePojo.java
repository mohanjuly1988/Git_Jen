package pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown=true)
public class NamePojo 
{
	@JsonProperty("official")
	@JsonIgnore
	private String official;
	
	@JsonProperty("nativeName")
	@JsonIgnore
	private String nativeName;
	
	private String common;

	public String getCommon() {
		return common;
	}

}
