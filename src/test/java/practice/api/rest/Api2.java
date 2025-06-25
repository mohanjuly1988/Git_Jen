package practice.api.rest;

import java.io.File;
import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api2 
{

	RequestSpecification Req;
	Response Res;
	File F;
	String Spayload;
	HashMap HM;
	PojoA PC;
	ObjectMapper OM;
	
	@BeforeTest
	public void FileObj()
	{
		F = new File("C:\\Users\\mohan\\eclipse-workspace"
				+ "\\practice.api.rest\\src\\test"
				+ "\\resources\\Payload1.json");
	}
	
	@BeforeTest
	public void StringPay()
	{
		Spayload = "{\r\n"
				+ "    \"title\": \"API Testing\",\r\n"
				+ "    \"body\": \"Rest Assured\",\r\n"
				+ "    \"userId\": 201\r\n"
				+ "}";
	}
	
	@BeforeTest
	public void HashM()
	{
		HM = new HashMap<String,Object>();
		HM.put("title", "Java Programming");
		HM.put("body","Rest Assured Testing");
		HM.put("userId", 100);
	}
	
	@BeforeTest
	public void PojoC()
	{
		PC = new PojoA();
		PC.setHeading("API Class");
		PC.setContent("Pojo Class");
		PC.setUserNumber(210);
	}
	
	@Test(priority=1)
	public void ReqF()
	{
		Api_Utility1.Ops1(Req,Res,F,Spayload, HM,PC);
		
	}
	
	@Test(priority=1)
	public void ReqS()
	{
		
		System.out.println("String Payload");
		Req=Api_Utility1.Ops1(Req,Res,F,Spayload,HM,PC);
		
	}
	
	@Test(priority=1)
	public void ReqH()
	{
		System.out.println("HasMap");
		Req=Api_Utility1.Ops1(Req,Res,F,Spayload,HM,PC);
	}
	
	@Test(priority=1)
	public void ReqP()
	{
		System.out.println("POJO");
		
		Req=Api_Utility1.Ops1(Req,Res,F,Spayload,HM,PC);
		
	}
	@Test(priority=2)
	public void Ser() throws JsonProcessingException
	{
		OM = new ObjectMapper();
		OM.enable(SerializationFeature.INDENT_OUTPUT);
		System.out.println(OM.writeValueAsString(PC));
	}
	
	@Test(priority=3)
	public void Subm()
	{
		
		Res = Req.post();
	}
	
	
	
	@Test(dependsOnMethods="Subm")
	public void Resp()
	{
	    System.out.println(Res.statusCode());
	    System.out.println(Res.asPrettyString());
	}
	
	
	
	
	
	
	
}
