package practice.api.rest1;

import java.io.File;
import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Testing1  
{
       RequestSpecification Req = null;
       Response Res = null;
       File F = null;
       String Ps = null;
       HashMap Hm = null;
       Test_Pojo1 Tp = null;
       ObjectMapper Om = null;
       
      @BeforeTest
      public void FileT1()
      {
    	  F = new File("src/test/resources/Way1.json");
    	  System.out.println("File object created!");
      }
      
      @BeforeTest
      public void StringT1()
      {
    	  Ps = "{\r\n"
    	  		+ "  \"userId\": 1,\r\n"
    	  		+ "  \"title\": \"wishes\",\r\n"
    	  		+ "  \"body\": \"All the best\"\r\n"
    	  		+ "}";
      }
      
      @BeforeTest
      public void HashT1()
      {
    	  Hm = new HashMap<String,Object>();
    	  Hm.put("UserId", 129);
    	  Hm.put("title", "Python Programming");
    	  Hm.put("body", "Collections");
    	 
      }
      
      @BeforeTest
      public void PojoObj1()
      {
    	  Tp = new Test_Pojo1();
    	  Tp.setUsecaseId(121);
    	  Tp.setTitle("Learning"); 
    	  Tp.setBody("Rest API");
    	  
    	  
      }
      
      @BeforeTest(dependsOnMethods= {"PojoObj1"})
      public void ObjMap() throws JsonProcessingException
      {
    	  Om = new ObjectMapper();
    	  Om.enable(SerializationFeature.INDENT_OUTPUT);
    	  System.out.println(Om.writeValueAsString(Tp));
      }
      
      @Test(priority=1)
      public void ReqF1()
      {
    	  Req = TestUtility.ApiTest(F, Req, Ps,Hm,Tp);
    	  System.out.println("Request has been created!");
      }
      
      @Test(priority=1)
      public void ReqS1()
      {
    	   Req=TestUtility.ApiTest(F, Req, Ps,Hm,Tp);
    	   System.out.println("Request has been created!");
      }
      
      
      @Test(priority=1)
      public void ReqH1()
      {
    	  Req = TestUtility.ApiTest(F, Req, Ps,Hm,Tp);
    	  System.out.println("Hmap Request has been created!");
      }
      
      @Test(priority=1)
      public void ReqP1()
      {
    	  Req = TestUtility.ApiTest(F,Req,Ps,Hm,Tp);
    	  System.out.println("Pojo Request has been created!");
      }
      
      @Test(priority=2)
      public void SubPost1()
      {
    	  Res=TestUtility.Submission(Req, Res);
    	  System.out.println("Post Request has been submitted!");
      }
      
      @Test(priority=2)
      public void SubGet1()
      {
    	  Res=TestUtility.Submission(Req, Res);
    	  System.out.println("Get Request has been submitted!");
      }
      
      @Test(priority=3)
      public void ResT1()
      {
    	 
    	 System.out.println(Res.statusCode());
    	 System.out.println(Res.asPrettyString());
      }
      
      
	
	
}
