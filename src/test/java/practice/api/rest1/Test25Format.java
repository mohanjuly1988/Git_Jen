package practice.api.rest1;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojos.FormatPojo;

public class Test25Format 
{
	
	String Json1 = null;
	String Json2 = null;
	String Json3 = null;
	ObjectMapper Om = null;
	
	@Test(priority=1)
	public void ResponseF25() throws JsonMappingException, JsonProcessingException
	{
		ObjectMapper om = new ObjectMapper();
		String json1 = "{ \"Datess\": \"ASDF3456F\" }";
		String json2 = "{ \"Datess\": \"1232sdfg5\" }";

		FormatPojo obj1=om.readValue(json1, FormatPojo.class);
		System.out.println(obj1.getDatess());
		
		FormatPojo obj2=om.readValue(json2, FormatPojo.class);
		System.out.println(obj2.getDatess());
		
		
	}
	

}
