package practice.api.rest1;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utility_API 
{

	public static void ApiUt(File F, String PayloadS,RequestSpecification Req)
	{
		StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
		String CallerMethod = StackTrace[2].getMethodName();
		
		if(CallerMethod.equalsIgnoreCase("RequestC1"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://jsonplaceholder.typicode.com");
			Req.basePath("/posts");
			Req.header("Content-Type", "application/json");
			Req.body(F);
		}
		
		else if(CallerMethod.equalsIgnoreCase("RequestC2"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://jsonplaceholder.typicode.com");
			Req.basePath("/posts");
			Req.header("Content-Type", "application/json");
			Req.body(PayloadS);
		}
		
		else
		{
			System.out.println("The called method is not available!");
		}	
		
	}
	
	public static void Submissions(Response Res)
	{
		StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
	}
	
	
}
