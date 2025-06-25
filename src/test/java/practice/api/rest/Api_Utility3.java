package practice.api.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api_Utility3 
{

	
	
	public static RequestSpecification Ops(RequestSpecification Req, Response Res,PojoD Pocd1, PojoF Pocf1)
	{
		StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
		String CallerMethod = StackTrace[2].getMethodName();
		
		if(CallerMethod.equalsIgnoreCase("Req1"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://reqres.in");
			Req.basePath("api/users");
			Req.header("Content-Type","application/Json");
			Req.body(Pocd1);
		}
		
		else if(CallerMethod.equalsIgnoreCase("Req2"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://reqres.in");
			Req.basePath("/api/users/{id}");
			Req.pathParam("id", 2);	
			Req.header("Content-Type","application/Json");
			
		}
		
		return Req;
		
	}
	
	
}
