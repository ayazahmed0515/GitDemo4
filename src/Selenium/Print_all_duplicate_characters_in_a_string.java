package Selenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Print_all_duplicate_characters_in_a_string {
	
	public static void countDuplicateCharacters(String str) {
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		char[] charArray=str.toCharArray();
		for(char c:charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				}else
				{
					map.put(c, 1);
				}
			
		}
		
		Set<Character>  keys=map.keySet();
		System.out.println(keys);
		for(Character c : keys) {
			if(map.get(c)>1) {
				System.out.println(c + "  is " + map.get(c) + " times");  
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		countDuplicateCharacters(str);
	}

}
