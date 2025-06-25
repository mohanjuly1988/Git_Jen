package practice.api.rest;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Api5 
{

	ObjectMapper Om;
	String Json1;
	String Json2;
	PojoE P01;
	
	@Test(priority=1)
	public void JsonRes5()
	{
		Json1 = "{\"FirstName\": \"M.G.Scott\"}";
		Json2 = "{\"F_name\": \"J.Luther\"}";
	}
	
	@Test(priority=2)
	public void Dser5() throws JsonMappingException, JsonProcessingException
	{
		Om = new ObjectMapper();
		PojoE P1 = Om.readValue(Json1, PojoE.class);
		PojoE P2 = Om.readValue(Json2, PojoE.class);
		System.out.println(P1.getFirst_Name());
		System.out.println(P2.getFirst_Name());
		
	}
	
	@Test(priority=3)
	public void Ser5() throws JsonProcessingException
	{
		P01 = new PojoE();
		P01.First_Name="KKP";
		//Om = new ObjectMapper();
		Om.enable(SerializationFeature.INDENT_OUTPUT);
		System.out.println(Om.writeValueAsString(P01));
	}
	
}
