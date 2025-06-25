package practice.api.rest1;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.RegisterPojo;
import pojos.TokenPojo;

public class Test22 
{
	
	RequestSpecification Req;
	Response Res;
	ObjectMapper Om;
	RegisterPojo Rp;
	TokenPojo Tp;
	
    @Test(priority=1)
	public void Reqc22()
	{
		
		Req = RestAssured.given();
		Req.baseUri("https://reqres.in");
		Req.basePath("/api/register");
		Rp = new RegisterPojo("eve.holt@reqres.in","pistol");
		Req.body(Rp);
		Req.headers("Content-Type", "application/json");
	}
	
    @Test(priority=2,dependsOnMethods="Reqc22")
	public void Sub22()
	{
		Res = Req.post();
	}
	
    @Test(priority=3)
	public void Ser22() throws JsonProcessingException
	{
		Om = new ObjectMapper();
		Om.enable(SerializationFeature.INDENT_OUTPUT);
		System.out.println(Om.writeValueAsString(Rp));
	}
	
    @Test(priority=4,dependsOnMethods="Sub22")
	public void Res22()
	{
		System.out.println(Res.statusCode());
		System.out.println(Res.getBody().asPrettyString());
	}
	
    @Test(priority=5,dependsOnMethods="Res22")
	public void Dser22() throws JsonMappingException, JsonProcessingException
	{
		Tp = Om.readValue(Res.getBody().asPrettyString(), TokenPojo.class);
		System.out.println(Tp.getIdNumber());
		System.out.println(Tp.getJwt());
	}
	
	
}
