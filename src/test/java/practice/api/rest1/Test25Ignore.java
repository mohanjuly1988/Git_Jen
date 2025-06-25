package practice.api.rest1;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojos.SampleIgnore;

public class Test25Ignore 
{
	@Test(priority=1)
	public void TestIgnore25() throws JsonProcessingException
	{
		//deserialization(@JsonIgnoreProperties(ignoreUnknown = true) will work for missing fields)
		ObjectMapper om = new ObjectMapper();
		String json1 = "{ \"job\": \"teacher\" }";
		SampleIgnore obj1=om.readValue(json1, SampleIgnore.class);
		System.out.println(obj1.getJob());
		//serialization(@JsonInclude(JsonInclude.Include.NON_DEFAULT) wiil work to take given fields only)
		SampleIgnore obj2=new SampleIgnore();
		obj2.setName("abdul kalam");
		String json2 = om.writeValueAsString(obj2);
		System.out.println(json2);
		
	}

}
