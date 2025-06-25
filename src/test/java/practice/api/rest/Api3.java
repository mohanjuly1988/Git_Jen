package practice.api.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api3 
{
	RequestSpecification Req;
	Response Res;
	PojoB Poc;
	PojoC Poc2;
	
	
	@BeforeTest
	public void PojoC1()
	{
		Poc = new PojoB();
		
		Poc.setEmployeeName("morpheus");
		Poc.setOccupation("leader");
		
		
	}
	
	@BeforeTest
	public void PojoC2()
	{
		Poc2 = new PojoC();
		Poc2.setEmailid("eve.holt@reqres.in");
		Poc2.setPassword("cityslicka");
	}
	
	@Test(priority=1)
	public void Pser() throws JsonProcessingException
	{
		ObjectMapper OM = new ObjectMapper();
		OM.enable(SerializationFeature.INDENT_OUTPUT);
		System.out.println(OM.writeValueAsString(Poc));
		
	}
	@Test(priority=1)
	public void Pser2() throws JsonProcessingException
	{
		ObjectMapper OM = new ObjectMapper();
		OM.enable(SerializationFeature.INDENT_OUTPUT);
		System.out.println(OM.writeValueAsString(Poc2));
	}
	
	@Test(priority=2)
	public void ReqP1()
	{
		Req = Api_Utility2.Ops(Req, Res, Poc,Poc2);
	}
	
	@Test(priority=2)
	public void ReqP2()
	{
		Req = Api_Utility2.Ops(Req, Res, Poc,Poc2);
		
	}
	
	@Test(dependsOnMethods="ReqP1")
	public void Subm()
	{
		Res = Req.post();	
		
	}
	
	@Test(dependsOnMethods="Subm")
	public void Resp()
	{
		System.out.println(Res.statusCode());
		System.out.println(Res.asPrettyString());
		//Res.then().log().all();
	}
	
	@Test(dependsOnMethods="Resp")
	public void Des() throws JsonMappingException, JsonProcessingException
	{
	   ObjectMapper Om = new ObjectMapper();
	   Poc = Om.readValue(Res.getBody().asPrettyString(), PojoB.class);
	   //System.out.println(Poc.);	
	}
	

}
