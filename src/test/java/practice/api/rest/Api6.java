package practice.api.rest;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api6 
{

	RequestSpecification Req;
	Response Res;
	PojoG PG1;
	ObjectMapper Om;
	
	@Test(priority=1)
	public void Req6()
	{
		Req = RestAssured.given();
		Req.baseUri("https://reqres.in");
		Req.basePath("/api/users");
		Req.queryParam("page", "2");
		Req.header("Content-Type","application/Json");
	}
	
	
	@Test(priority=2)
	public void Subm()
	{
	       Res = Req.get();	
	       System.out.println(Res.statusCode());
	       System.out.println(Res.asPrettyString());
		
	}
	
	@Test(priority=3)
	public void Dser6() throws JsonMappingException, JsonProcessingException
	{
		Om = new ObjectMapper();
		PG1 = Om.readValue(Res.getBody().asPrettyString(), PojoG.class);
		System.out.println(PG1.getPage());
		int Size = PG1.getData().size();
		System.out.println(PG1.getData().get(Size-1).first_name);
		System.out.println(PG1.getData().get(Size-2).last_name);
		System.out.println(PG1.getSupport().getText());
		
	}
	
	
	
}
