package practice.api.rest1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Testing2 
{
	
	RequestSpecification Req = null;
	Response Res = null;
	ObjectMapper Om = null;
	Test_Pojo2 Tp2 = null;
	
		
	@Test(priority=1)
	public void RequestC2()
	{
		Req = TestUtility2.Creation(Req);
		System.out.println("Request has been created!");
	}
	
	@Test(priority=2)
	public void SubGet2()
	{
		Res = TestUtility2.Recieving(Res,Req);
		System.out.println("Request is submitted!");
		
	}
	
	@Test(priority=3)
	public void Response2()
	{
	
		System.out.println(Res.statusCode());
		//System.out.println(Res.asPrettyString());

	}
	
	@Test(priority=4)
	public void Deserialization2() throws JsonMappingException, JsonProcessingException
	{
		Om = new ObjectMapper();
		Tp2 = Om.readValue(Res.getBody().asPrettyString(), Test_Pojo2.class);
		//System.out.println(Tp2);
		//int Size = Tp2.getData().size();
		System.out.println(Tp2.getPage());
		System.out.println(Tp2.getPer_page());
		System.out.println(Tp2.getTotal());
		System.out.println(Tp2.getTotal_pages());
				System.out.println(Tp2.getSupport().getText());
				System.out.println(Tp2.getSupport().getUrl());
				
		//System.out.println(Tp2.getData().get(Size-1).getEmail());
	}
	
	
	
	

}
