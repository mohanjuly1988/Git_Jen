package practice.api.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APi4 
{
	RequestSpecification Req;
	Response Res;
	PojoD Pocd1;
	PojoF Pocf1;
	
	@BeforeTest
	public void ReqPojo1()
	{
	  Pocd1 = new PojoD("leader","morpheus");
	  Pocf1 = new PojoF();
	}
	
	@Test(priority=1)
	public void Ser1() throws JsonProcessingException
	{
		ObjectMapper Om = new ObjectMapper(); 
		Om.enable(SerializationFeature.INDENT_OUTPUT);
		System.out.println(Om.writeValueAsString(Pocd1));
		
	}
	
	@Test(priority=2)
	public void Req1()
	{
		Req = Api_Utility3.Ops(Req, Res, Pocd1,Pocf1);
	}
	
	@Test(priority=2)
	public void Req2()
	{
		Req = Api_Utility3.Ops(Req, Res, Pocd1, Pocf1);
	}
	
	@Test(priority=3)
	public void Subm1()
	{
		Res = Req.post();
	}
	
	@Test(priority=3) 
	public void Subm2()
	{
		Res = Req.get();
	}
	@Test(priority=4,dependsOnMethods="Subm2")
	public void Dser1() throws JsonMappingException, JsonProcessingException
	{
		
		ObjectMapper Om = new ObjectMapper();
		
		Pocf1 = Om.readValue(Res.getBody().asPrettyString(), PojoF.class);
		
		//Pocf1 = new PojoF();
		//Pocf1.getData();
		
		System.out.println(Pocf1.getData().FirstName);
		System.out.println(Pocf1.getData().LastName);
		
		
	}
	
	@Test(priority=5,dependsOnMethods="Subm2")
	public void Res1()
	{
		System.out.println(Res.statusCode());
		System.out.println(Res.getBody().asPrettyString());
	}
	

	
	
}
