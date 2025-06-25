package pojos;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.io.File;

public class Test {

	public static void main(String[] args) 
	{
		
		
	        File file = new File(System.getProperty("user.dir") + ""
	        		+ "/src/test/resources/postdata.json");

	        RestAssured.given()
	                .baseUri("https://jsonplaceholder.typicode.com")
	                .basePath("/posts")
	                .header("Content-Type", "application/json")
	                .body(file) // Set the request body from the JSON file
	                .log().all()
	                .when()
	                .post()
	                .then()
	                .log().all();
	    }
	}
	                        
	        	

