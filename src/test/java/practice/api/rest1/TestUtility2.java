package practice.api.rest1;

import java.io.File;
import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestUtility2 
{
	
	static StackTraceElement[] Trace = null;
	static String Caller = null;

	
	
	public static RequestSpecification Creation(RequestSpecification Req)
	{
		
		Trace = Thread.currentThread().getStackTrace();
		Caller = Trace[2].getMethodName();		
		
		if(Caller.equalsIgnoreCase("RequestC2"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://reqres.in");
			Req.basePath("/api/users");
			Req.queryParam("page", "2");
			Req.header("Content-Type","application/json");
			Req.body("");
		}
		
		return Req;
		
	}
	
	public static  Response Recieving(Response Res, RequestSpecification Req)
	{
		
		Trace = Thread.currentThread().getStackTrace();
		Caller = Trace[2].getMethodName();
		
		if(Caller.equalsIgnoreCase("SubGet2"))
		{
		      	Res = Req.get();
		      	
		}
		
		return Res;		
		
	}

}
