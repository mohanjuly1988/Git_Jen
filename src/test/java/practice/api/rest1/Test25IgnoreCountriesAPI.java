package practice.api.rest1;

import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.CountryPojo;

public class Test25IgnoreCountriesAPI 
{
	
	RequestSpecification Req = null;
	Response Res = null;
	List<CountryPojo> Cp = null;
	ObjectMapper Om = null;
	
	@Test(priority=1)
	public void RequestCC25()
	{
		Req = RestAssured.given();
		Req.baseUri("https://restcountries.com");
		Req.basePath("/v3.1/all");
		Req.queryParam("fields", "name");
		Req.queryParam("fields", "capital");
		
		System.out.println("Request has been created.");
	}
	
	
	@Test(priority=3)
	public void SubC25()
	{
		Res = Req.get();
		System.out.println("Response has been submitted!");
	}
	
	@Test(priority=4)
	public void ResC25()
	{
		System.out.println(Res.statusCode());
		System.out.println(Res.asPrettyString());
	}
	
	@Test(priority=5)
	public void DeserC25() throws JsonMappingException, JsonProcessingException
	{
		Om = new ObjectMapper();
		Cp = Om.readValue(Res.getBody().asPrettyString(), new TypeReference<List<CountryPojo>>() {});
		
		
	}
	

}
