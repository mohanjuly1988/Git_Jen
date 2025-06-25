package practice.api.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api1 
{
	RequestSpecification Req;
	Response Res;

	
	@Test(priority=1)
	public void Reqc()
	{
		Req = RestAssured.given();
		Req.baseUri("https://api.weatherapi.com");
		Req.basePath("v1/current.xml");
		Req.queryParam("key", "0d728d7cc86248e7a3231321241012");
		Req.queryParam("q", "plainsboro");
		Req.header("Content-Type", "application/Json");
	}
	
	@Test(dependsOnMethods= {"Reqc"})
	public void Subm()
	{
		Res = Req.get(); 
		
	}
	
	@Test(dependsOnMethods= {"Subm"})
	public void Resp()
	{
		try
		{
			System.out.println(Res.statusCode());
			
			System.out.println(Res.asPrettyString());
		}
		
		catch(Exception E)
		{
			System.out.println("No response!");
		}
	}
	
}
