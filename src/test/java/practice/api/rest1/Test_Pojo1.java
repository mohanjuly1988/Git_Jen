package practice.api.rest1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(Include.NON_DEFAULT)
@JsonPropertyOrder({"UserId","title","body"})
@JsonIgnoreProperties({"usecaseId"})
public class Test_Pojo1 
{
	
//	@JsonIgnore
private int Kkp;
	
	@JsonProperty("UserId")
	private int UsecaseId;
	
	
	private String title;
	
	
	private String body;
	
	
	private int id;
	
//	@JsonCreator
//	public Test_Pojo1(int UserId, 
//			String title,String body,int id)
//	{
//		this.UsecaseId = UsecaseId;
//		this.title=title;
//		this.body=body;
//		this.id=id;
//		
//		
//	}

	
	public int getUsecaseId() 
	{
		return UsecaseId;
	}
	
	public void setUsecaseId(int usecaseId) 
	{
		UsecaseId = usecaseId;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getId() {
		return id;
	}
	

}
