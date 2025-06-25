package practice.api.rest;

import java.io.File;
import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api_Utility1 
{

	public static RequestSpecification Ops1(RequestSpecification Req,Response Res,File F,String Spayload,
			HashMap HM,PojoA PC)
	{
		
		
		StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
		String CallerMethod = StackTrace[2].getMethodName();
		
		if(CallerMethod.equals("ReqF"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://jsonplaceholder.typicode.com");
			Req.basePath("/posts");
			Req.header("Content-Type", "application/Json");
			Req.body(F);
			
		}
		
		else if(CallerMethod.equals("ReqS"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://jsonplaceholder.typicode.com");
			Req.basePath("/posts");
			Req.header("Content-Type", "application/Json");
			Req.body(Spayload);
			
		}
		
		else if(CallerMethod.equals("ReqH"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://jsonplaceholder.typicode.com");
			Req.basePath("/posts");
			Req.header("Content-Type", "application/Json");
			Req.body(HM);
		}
		
		else if(CallerMethod.equals("ReqP"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://jsonplaceholder.typicode.com");
			Req.basePath("/posts");
			Req.header("Content-Type", "application/Json");
			Req.body(PC);
		}
		
		
		return Req;
		
//		if(CallerMethod.equals("ReqS"))
//		{
//			Req = RestAssured.given();
//			Req.baseUri("https://jsonplaceholder.typicode.com");
//			Req.basePath("/posts");
//			Req.body(Spayload);
//		}
	
	}
	
}
