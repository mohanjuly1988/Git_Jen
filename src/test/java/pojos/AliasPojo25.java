package pojos;

import com.fasterxml.jackson.annotation.JsonAlias;

public class AliasPojo25 
{

	@JsonAlias({"fName","f_name","firstName"})
	private String firstName;

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
}
