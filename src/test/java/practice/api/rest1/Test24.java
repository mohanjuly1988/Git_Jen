package practice.api.rest1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.LoginResponsePojo;

public class Test24 
{

	RequestSpecification Req;
	Response Res;
	ObjectMapper Om;
	LoginResponsePojo Lr;
	
	@BeforeTest
	public void ValueAssignment()
	{
		Lr = new LoginResponsePojo("eve.holt@reqres.in","cityslicka");
		
	}
	
	
	@Test(priority=1)
	public void Reqc24()
	{
		Req = RestAssured.given();
		Req.baseUri("https://reqres.in/");
		Req.basePath("/api/login");
		Req.body(Lr);
		Req.headers("Content-Type", "application/json");
		System.out.println("Request Created! ");
	}
	
	@Test(priority=2)
	public void Ser24() throws JsonProcessingException
	{
		Om = new ObjectMapper();
		Om.enable(SerializationFeature.INDENT_OUTPUT);
		System.out.println(Om.writeValueAsString(Lr));
		
	}
	
	@Test(priority=3,dependsOnMethods="Reqc24")
	public void Subm24()
	{
		 Res = Req.post();
		 System.out.println("Request Submitted! ");
	}
	
	
	@Test(priority=4,dependsOnMethods="Subm24")
	public void Res24()
	{
		System.out.println(Res.statusCode());
		System.out.println(Res.asPrettyString());
		
	}
	
	@Test(priority=5,dependsOnMethods="Res24")
	public void Deser24() throws JsonMappingException, JsonProcessingException
	{
		Lr = Om.readValue(Res.getBody().asPrettyString(), LoginResponsePojo.class);
		System.out.println("In deserialization, the token value is: "+Lr.Acknowledgment);
	}
	
}
