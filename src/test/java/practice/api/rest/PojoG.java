package practice.api.rest;

import java.util.List;


public class PojoG 
{	
	   public int page;
	   public int per_page;
	   public int total;
	   public int total_pages;
	   
	   public List<PojoG1> data;
	   public Sup support;
			
	
   public int getPage() {
		return page;
	}
	public int getPer_page() {
		return per_page;
	}
	public int getTotal() {
		return total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public List<PojoG1> getData() {
		return data;
	}
	public Sup getSupport() {
		return support;
	}
   
	
}
