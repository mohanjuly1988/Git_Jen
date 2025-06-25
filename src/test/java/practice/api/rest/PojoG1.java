package practice.api.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"avatar"})
public class PojoG1 
{

	public int id;
	public String email;
	public String first_name;
	public String last_name;
	//public String avatar; 
	
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	
	
	
}
