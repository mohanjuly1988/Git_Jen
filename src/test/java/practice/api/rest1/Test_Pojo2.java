package practice.api.rest1;

import java.util.List;

public class Test_Pojo2 
{

	private int page;
	
	private int per_page;
	
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

	public List<Data_Area> getData() {
		return data;
	}

	public Support_Area getSupport() {
		return support;
	}

	private int total;
	
	private int total_pages;
	
	private List<Data_Area> data;
	
	private Support_Area support;
	
}
