package Selenium;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		hmap.put("Ahmad", 38);
		hmap.put("Ahmad1", 31);
		hmap.put("Ahmad2", 32);
		hmap.put("Ahmad3", 33);
		hmap.put("Ahmad4", 34);
		hmap.put("Ahmad5", 35);
		System.out.println(hmap.get("Ahmad1"));
		
		System.out.println(hmap.size());
	if(hmap.containsValue(38)) {
		System.out.println("Age of Ahmad is : " + hmap.get(38));
	}
		
	}

}
