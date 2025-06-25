package practice.api.rest;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User 
{

    @JsonProperty("first_name")
	String FirstName;
    
    @JsonProperty("last_name")
	String LastName;
    
    @JsonProperty("id")
    int Number;
    
    @JsonProperty("email")
    String EmailId;
    
    @JsonProperty("avatar")
    String Avatar;
    
    public String getUrl() {
		return Url;
	}

	public String getText() {
		return Text;
	}

	@JsonProperty("url")
    String Url;
    
    @JsonProperty("text")
    String Text;

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getNumber() {
		return Number;
	}

	public String getEmailId() {
		return EmailId;
	}
	
	public String getAvatar() {
		return Avatar;
	}
}
