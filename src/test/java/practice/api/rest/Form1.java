package practice.api.rest;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Form1 
{
	RequestSpecification Req;
	Response Res;
	
	@Test(priority=1)
	public void Reqf1()
	{
		Req = RestAssured.given();
		Req.baseUri("http://postman-echo.com");
		Req.basePath("/post");
		Req.formParam("Name", "Sheldon");
		Req.formParam("Email", "CooperFamily@gmail.com");
		Req.header("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
	}
	
	@Test(priority=2,dependsOnMethods="Reqf1")
	public void Subf1()
	{
		Res = Req.post();
	}
	
	@Test(priority=3,dependsOnMethods="Subf1")
	public void Resf1()
	{
		System.out.println(Res.statusCode());
		System.out.println(Res.asPrettyString());
	}
	
	

}
