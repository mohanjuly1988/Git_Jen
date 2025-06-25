package practice.api.rest1;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.JobRegisterPojo;

public class Test23 
{
	RequestSpecification Req;
	Response Res; 
	JobRegisterPojo Jr;
	ObjectMapper Om;
	
	@BeforeTest
	public void ValuesSet23()
	{
		Jr = new JobRegisterPojo();
		Jr.setCustomerName("Sheldon Cooper");
		Jr.setOccupation("Scientist!");
		Jr.setEmployeeId(1465);
	}
	
	
	@Test(priority=1)
	public void Reqc23()
	{
		Req = RestAssured.given();
		Req.baseUri("https://reqres.in");
		Req.basePath("/api/users");
		Req.body(Jr);
		Req.headers("Content-Type", "application/json");
		System.out.println("Request Created! ");
	}
	
	@Test(priority=2)
	public void Ser23() throws JsonProcessingException
	{
		Om = new ObjectMapper();
		Om.enable(SerializationFeature.INDENT_OUTPUT);
		System.out.println(Om.writeValueAsString(Jr));
		
	}
	
	@Test(priority=3)
	public void Subm23()
	{
		Res = Req.post();
		System.out.println(Res.statusCode());
		System.out.println(Res.asPrettyString());
		
	}
	
	
	@Test(priority=4,dependsOnMethods="Subm23")
	public void Dser23() throws JsonMappingException, JsonProcessingException
	{
	
		Jr = Om.readValue(Res.getBody().asPrettyString(), JobRegisterPojo.class);
		System.out.println("Customer Name: "+Jr.getCustomerName());
		System.out.println("Customer Occupation: "+Jr.getOccupation());
		System.out.println("Customer Employee id: "+Jr.getEmployeeId());
		//System.out.println("Time stamp: "+Jr.getTimeStamp());
		
		Date Ft = Jr.getTimeStamp();
		
		LocalDateTime localDateTime = Ft.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
		
		int Year = localDateTime.getYear();
		int Month = localDateTime.getMonthValue();
		System.out.println(Year+" "+Month);
		
	}
	
	
	

}
