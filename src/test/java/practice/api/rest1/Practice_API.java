package practice.api.rest1;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Practice_API 
{

	RequestSpecification Req = null;
	Response Res = null;
	File F = null;
	String PayloadS = null;
	
	@BeforeTest
	public void FileC()
	{
		F = new File("src/test/resources/Way1.json");
		System.out.println(F);
	}
	
	@BeforeTest
	public void StringC()
	{
		PayloadS = "{\r\n"
				+ "  \"userId\": 1,\r\n"
				+ "  \"title\": \"wishes\",\r\n"
				+ "  \"body\": \"All the best\"\r\n"
				+ "}";
	}

	@Test(priority=1)
	public void RequestC1()
	{
	
		
		Utility_API.ApiUt(F, PayloadS, Req);
		System.out.println("Request has been created!");
	}
	
	@Test(priority=1)
	public void RequestC2()
	{
		
		System.out.println("Request has been created!");
		
	}
	
	@Test(priority=2)
	public void SubmitR()
	{
		Res = Req.post();
		System.out.println("Request has been submitted!");
	}
	
	@Test(priority=3)
	public void ResponseG()
	{
		System.out.println(Res.statusCode());
		System.out.println(Res.asPrettyString());
	}
	

	
}

