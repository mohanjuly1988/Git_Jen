package practice.api.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_DEFAULT)
public class PojoA 
{

	@JsonIgnore
	String heading;
	
	@JsonIgnore
	String content;
	
	@JsonIgnore
	int userNumber;
	
	@JsonProperty("title")
	String Heading;
	
	@JsonProperty("body")
	String Content;
	
	@JsonProperty("userId")
	int UserNumber;
	
	@JsonProperty("Id")
	int IdNumber;
	
	public String getHeading() {
		return Heading;
	}
	public void setHeading(String heading) {
		Heading = heading;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getUserNumber() {
		return UserNumber;
	}
	public void setUserNumber(int userNumber) {
		UserNumber = userNumber;
	}
	
	public int getIdNumber() 
	{
		return IdNumber;
	}
	

	
}
