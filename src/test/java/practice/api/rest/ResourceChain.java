package practice.api.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResourceChain 
{

	RequestSpecification Req;
	Response Res;
	
	RequestSpecification Req1;
	Response Res1;
	String Cs;
	
	@Test(priority=1)
	public void Reqr1()
	{
		Req = RestAssured.given();
		Req.baseUri("https://www.smatbot.com");
		Req.basePath("/kya_backend/pagehub/chatbot_utils");
		Req.formParam("action", "init_chat");
		Req.formParam("device_print", "ed79cf898a7951b5f8858d2d7f4f106f");
		Req.formParam("chatbot_id", 4174);
		Req.formParam("language_code", "default");
	}
	
	@Test(priority=2,dependsOnMethods="Reqr1")
	public void Subm1()
	{
		Res = Req.post();
		
	}
	
	@Test(priority=3)
	public void Res1()
	{
		Cs = Res.jsonPath().getString("cb_session");
		System.out.println(Cs);
	}
	
	@Test(priority=4)
	public void Reqr2()
	{
		Req1 = RestAssured.given();
		Req1.baseUri("https://www.smatbot.com");
		Req1.basePath("/kya_backend/pagehub/chatbot_utils");
		Req1.formParam("action", "answer");
		Req1.formParam("answer_text", "test");
		Req1.formParam("cb_session", Cs);
		Req1.formParam("question_id", 4017);
		Req1.formParam("is_logical", 0);
		Req1.formParam("sequence", 2);
		Req1.formParam("chatbot_id", 4174);
		Req1.formParam("option", "undefined");
		Req1.formParam("visitor_link_traversal", "");
		Req1.formParam("language_code", "default");
	}
	
	@Test(priority=5,dependsOnMethods="Reqr2")
	public void Subm2()
	{
		Res1 = Req1.post();
		Res1.then().log().all();
	}
}
