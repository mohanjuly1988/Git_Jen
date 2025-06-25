package practice.api.rest1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import pojos.AliasPojo25;

public class Test25 
{
	
	String json1 = null;
	String json2 = null;
	String json3 = null;
	String json4 = null;
	 	
	ObjectMapper Om = null;
	AliasPojo25 Ap = null;
	
	
	@Test(priority=1)
	public void Response25()
	{
		json1 = "{ \"fName\": \"John\" }";
		json2 = "{ \"f_name\": \"kalam\" }";
		json3 = "{ \"firstName\": \"ratan\" }";
		json4 = "{\"FiRstName\":\"Sundar\"}";
		
		System.out.println("Three different responses!");
	}
	
	
	@Test(priority=2)
	public void Deser25() throws JsonMappingException, JsonProcessingException
	{
		Om = new ObjectMapper();
		Ap = Om.readValue(json2, AliasPojo25.class);
		System.out.println(Ap.getFirstName());
		
		Ap = Om.readValue(json1, AliasPojo25.class);
		System.out.println(Ap.getFirstName());
		
		Ap = Om.readValue(json3, AliasPojo25.class);
		System.out.println(Ap.getFirstName());
		
	}

}
