package practice.api.rest1;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.WeatherApiPojo;

public class Test25WeatherApi 
{
	
	RequestSpecification Req = null;
	Response Res = null;
	WeatherApiPojo Wa = null;
	ObjectMapper Om = null;
	
	@Test(priority=1)
	public void WeatherReq25()
	{
		Req = RestAssured.given();
		Req.baseUri("http://api.weatherapi.com");
		Req.basePath("/v1/current.json");
		Req.queryParam("key", "e9c3b0195be341c795281747202311");
		Req.queryParam("q", "Austin");
		
	}
	
	@Test(priority=2)
	public void WeatherGet25()
	{
		Res = Req.get();
		System.out.println("Response submittted!");
	}
	
	@Test(priority=3)
	public void WeatherRes25()
	{
		System.out.println(Res.statusCode());
	}
	
	@Test(priority=4)
	public void WeatherDes25() throws JsonMappingException, JsonProcessingException
	{
		
		Om = new ObjectMapper();
		Wa = Om.readValue(Res.getBody().asPrettyString(), WeatherApiPojo.class);
		System.out.println(Wa.getLocation().getName());
		System.out.println(Wa.getLocation().getCountry());
		System.out.println(Wa.getCurrent().getCelsius());
		System.out.println(Wa.getCurrent().getFahrenheit());
		System.out.println(Wa.getCurrent().getCondition().getText()); 
		
	}

}
