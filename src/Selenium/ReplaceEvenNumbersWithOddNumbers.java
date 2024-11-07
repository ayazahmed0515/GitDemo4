package Selenium;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReplaceEvenNumbersWithOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		for(int i=0; i<=10;i++) {
			list.add(i);
		}
		System.out.println("Elements of an Arraylist : " + list);
		
		ListIterator li=list.listIterator();
		System.out.println("Starting Iterator");
		while(li.hasNext()) {
			int i=(Integer)li.next();
			System.out.println(i);
			
			if(i%2==0) {
				i++;
			li.set(i);
			li.add(i);
			}
		}
				
		System.out.println("Elements of an Arraylist : " + list);

	}

}
