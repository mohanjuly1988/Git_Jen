package practice.api.rest;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Form2 
{
	RequestSpecification Req;
	Response Res;
	HashMap Hm;
	
	@BeforeTest
	public void Hmap2()
	{
		Hm = new HashMap<String,Object>();
		Hm.put("Name", "Sheldon");
		Hm.put("Email", "CooperFamily@gmail.com");
	}
	
	@Test(priority=1)
	public void Reqc2()
	{
		Req = RestAssured.given();
		Req.baseUri("http://postman-echo.com");
		Req.basePath("/post");
		Req.formParams(Hm);
		Req.header("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
	}
	
	@Test(priority=2,dependsOnMethods="Reqc2")
	public void Subf2()
	{
		Res = Req.post();
	}
	
	@Test(priority=3,dependsOnMethods="Subf2")
	public void Resf2()
	{
		System.out.println(Res.statusCode());
		System.out.println(Res.asPrettyString());
		System.out.println(Res.jsonPath().getString("form.Email"));
	}
	
	

}
