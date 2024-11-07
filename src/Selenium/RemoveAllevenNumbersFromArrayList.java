package Selenium;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAllevenNumbersFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Print only odd numbers from an array list
	ArrayList list=new ArrayList();
	
	for(int i=0; i<10; i++) {
		list.add(i);
	}
	System.out.println("Elements of ArrayList : " + list);
	Iterator it=list.iterator();
	while(it.hasNext()) {
		int i=(Integer)it.next();
		System.out.println(i);	
		
		if(i%2==0)
			it.remove();
		
	}
	
	System.out.println("Elements after removal of even numbers : " + list);
	}

}
