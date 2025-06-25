package pojos;

import com.fasterxml.jackson.annotation.JsonSetter;

public class TokenPojo 
{
	
	public int IdNumber;
	public String Jwt;
	
	public int getIdNumber() {
		return IdNumber;
	}
	@JsonSetter("id")
	public void setIdNumber(int idNumber) {
		IdNumber = idNumber;
	}
	public String getJwt() {
		return Jwt;
	}
	
	@JsonSetter("token")
	public void setJwt(String jwt) {
		Jwt = jwt;
	}

}
