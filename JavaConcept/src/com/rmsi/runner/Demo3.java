package com.rmsi.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo3 {
	
	public static void main(String[] args) {
		Map<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    
	    Map<String, String> capitalCities1 = new HashMap<String, String>();
	    capitalCities1.put("England1", "London1");
	    capitalCities1.put("Germany1", "Berlin1");
	    capitalCities1.put("Norway1", "Oslo1");
	    capitalCities1.put("USA1", "Washington DC1");
	    
	    List<Map<String, String>> lists=new ArrayList<Map<String, String>>();
	    lists.add(capitalCities);
	    lists.add(capitalCities1);
	    
	    System.out.println(capitalCities); 
	    
	   System.out.println(capitalCities1); 
	   
	   
	   System.out.println(lists.get(1).get("Germany1"));
	   
	   
	}

}
