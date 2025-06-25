package practice.api.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api_Utility2 
{

	
		
		public static RequestSpecification Ops(RequestSpecification Req,Response Res,PojoB Poc,PojoC Poc2)
		{
			
			StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
			String CallerMethod = StackTrace[2].getMethodName();
			
			if(CallerMethod.equalsIgnoreCase("ReqP1"))
			{
				Req = RestAssured.given();
				Req.baseUri("https://reqres.in");
				Req.basePath("api/users");
				Req.header("Content-Type", "application/Json");
				Req.body(Poc);
				
			}
			
			else if(CallerMethod.equalsIgnoreCase("ReqP2"))
			{
				Req=RestAssured.given();
				Req.baseUri("https://reqres.in");
				Req.basePath("api/login");
				Req.header("Content-Type","application/Json");
				Req.body(Poc2);
			}
			return Req;
		
		}
	
}
