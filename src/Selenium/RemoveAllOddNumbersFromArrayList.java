package Selenium;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAllOddNumbersFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print only even numbers from an array list
	ArrayList list=new ArrayList();
	
	for(int i=0; i< 10 ;i++) {
		list.add(i);
	}
	System.out.println("Elements of ArrayList : " + list);
	
	Iterator it=list.iterator();
	while(it.hasNext()) {
	int i =(Integer)it.next();
	System.out.println(i);
	
	//remove odd numbers from array list
	if(i%2!=0) 
		it.remove();
		
	}
	System.out.println("Elements after removal of odd numbers : " + list);
	}

}
