package practice.api.rest1;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.CountryPojo;

public class To_Experiment 
{

	public static void main(String[] args) 
	{
	
		List Rl = new ArrayList();
		Rl.add(123);
		System.out.println(Rl);
		
		List<String> Sl = Rl;
		System.out.println(Sl);
		



	}

}
