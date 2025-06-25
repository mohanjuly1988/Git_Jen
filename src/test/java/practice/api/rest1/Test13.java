package practice.api.rest1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test13 
{
	RequestSpecification Req;
	Response Res;
	
	@Test(priority=1)
	public void Reqc13()
	{
		Req = RestAssured.given();
		Req.baseUri("http://api.weatherapi.com");
		Req.basePath("/v1/current.json");
		Req.queryParam("key", "e9c3b0195be341c795281747202311");
		Req.queryParam("q", "baltimore");
		
	}
	
	@Test(priority=2,dependsOnMethods="Reqc13")
	public void Sub13()
	{
		Res = Req.get();
		
	}
	
	@Test(priority=3,dependsOnMethods="Sub13")
	public void Res13()
	{
		System.out.println(Res.statusCode());
		System.out.println(Res.getBody().asPrettyString());
	}

}
