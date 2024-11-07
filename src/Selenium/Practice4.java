package Selenium;

import java.util.HashMap;

public class Practice4 {
	
	public static void countDuplicateCharacters(String str) {
	
		HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
		
		char[] charArray=str.toCharArray();
		for(char c: charArray) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) +1);
			}else
			{
				hmap.put(c, 1);
			}
				
		}
		System.out.println(hmap);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		countDuplicateCharacters(str);
		
		
		
		
		
	}

}
