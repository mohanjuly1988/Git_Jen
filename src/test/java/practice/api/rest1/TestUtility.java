package practice.api.rest1;

import java.io.File;
import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestUtility 
{ 
	
	static StackTraceElement[] Trace = null;
	static String Caller = null;
     RequestSpecification Req = null;
	  Response Res = null;
	
	public static RequestSpecification ApiTest(File F, RequestSpecification Req,String Ps,
			HashMap Hm,Test_Pojo1 Tp)
	{
		Trace = Thread.currentThread().getStackTrace();
		Caller = Trace[2].getMethodName();
		
		if(Caller.equalsIgnoreCase("ReqF1"))
		{
			  Req = RestAssured.given();
	    	  Req.baseUri("https://jsonplaceholder.typicode.com");
	    	  Req.basePath("/posts");
	    	  Req.header("Content-Type","application/json");
	    	  Req.body(F);
	    	  
		}
		
		else if(Caller.equalsIgnoreCase("ReqS1"))
		{
			  Req = RestAssured.given();
	    	  Req.baseUri("https://jsonplaceholder.typicode.com");
	    	  Req.basePath("/posts");
	    	  Req.header("Content-Type","application/json");
	    	  Req.body(Ps);
	    	  
		}
		
		else if(Caller.equalsIgnoreCase("ReqH1"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://jsonplaceholder.typicode.com");
			Req.basePath("/posts");
			Req.header("Content-Type","application/json");
			Req.body(Hm);
			
		}
		
		else if(Caller.equalsIgnoreCase("ReqP1"))
		{
			Req = RestAssured.given();
			Req.baseUri("https://jsonplaceholder.typicode.com");
			Req.basePath("/posts");
			Req.header("Content-Type","application/json");
			Req.body(Tp);
			
		}
		
		else
		{
			System.out.println("The called method is not available!");
		}
		
		return Req;
			
	}
	
	public static Response Submission(RequestSpecification Req,Response Res)
	{
		Trace = Thread.currentThread().getStackTrace();
		Caller = Trace[2].getMethodName();
		
		if(Caller.equalsIgnoreCase("SubPost1"))
		{
			Res = Req.post();
			
		}
		
		else if(Caller.equalsIgnoreCase("SubGet1"))
		{
			Res = Req.get();
		}
		
		return Res;
		
	}

}
