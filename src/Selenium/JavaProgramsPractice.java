package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class JavaProgramsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Retrieve emailid from string
//		String s="please email us at mentor@Rahulshettyacademy.com with below template";
//		String email=s.split("at")[1].trim().split(" ")[0];
//		System.out.println(email);
		
		//2) Swap two strings without using third variable
//		String a="abc";
//		String b="def";		
//		a=a+b;//abcdef
//		b=a.substring(0,(a.length()-b.length()));//abc
//		a=a.substring(b.length());//def
//		System.out.println(a);
//		System.out.println(b);
		
		//3) Find no of vowels in a String and print all the vowels
		
//		String s="ergedfbcasfaffsfdsfdiifdvdfoovsdvudsvu";
//		String t="";
//		String g="";
//		int counter=0;
//		for(int i=s.length()-1;i>=0;i--) {
//			
//			t=g+s.charAt(i);
//			if(t.equals("a")||t.equals("e")||t.equals("i")||t.equals("o")||t.equals("u")) {
//				counter=counter+1;
//		System.out.println(t);
//			}
//				
//		}
//		System.out.println(counter);
		
		//4) Fibonacci first 8- 1,2,3,5,8,13,21,34
//		
//		int a=0;
//		int b=1;
//		int fib=0;
//		int i=0;
//		while(i<8) {
//			fib=a+b;
//			a=b;
//			b=fib;
//			System.out.println(fib);
//			i++;
//		}
		
		//5) reverse a string and check if it is palindrome or not
//		String s="madam";
//		String t="";
//		for(int i=s.length()-1;i>=0;i--) {
//			t=t+s.charAt(i);
//		}
//		System.out.println(t);
//		if(s.equals(t)) {
//			System.out.println("palindrome");
//		}
//		else{
//			System.out.println("not palindrome");
//		}
		
		
		//6) Swap 2 numbers without using 3rd variable
		
//		int a=10;
//		int b=20;
//		a=a+b;//30
//		b=a-b;//10
//		a=a-b;//20
//		System.out.println(a);
//		System.out.println(b);
		
		//7)	Reverse a number
		
//		int a=543;
//		int reverse=0;
//		
//		while(a!=0) {
//			int digit=a%10;
//			reverse=digit+reverse*10;
//			a=a/10;
//					
//		}
//		
//		System.out.println(reverse);
		
		//8) Factorial of 7
		
//		int num=7;
//		int fact=1;
//		for(int i=1; i<=num;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		
		//9)	Identify if number is prime or not
//		int val=109;
//		boolean flag=false;
//		for(int i=2; i<=val/2;i++) {
//			if(val%i==0) {
//				flag=true;
//			break;}
//				}
//		if(flag) {
//			System.out.println("Not Prime");
//		}else {
//			System.out.println("Prime");
//		}
		
		
		//10) Sort in Ascending order using Array and display third lowest in the array
		
//		int arr[]= {87,45,67,2,8};
//		
//		Arrays.sort(arr);
//		for(int values: arr)
//		{
//			System.out.println(values);
//		}
//		
//		System.out.println(arr[2]);
		
		//11) Sort in descending order using Array and display fourth highest in the array
		
//		Integer arr[]= {67,34,78,98,56,3,90};
//		Arrays.sort(arr,Collections.reverseOrder());
//		for(int values:arr)
//		{
//			System.out.println(values);
//		}
//		System.out.println(arr[3]);
		
		//12) sort in descending order without using arrays or list and display 4th highest
//		int arr[]= {67,34,78,98,56,3,90};
//		int temp=0;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			System.out.println(arr[i]);
//		}
//		System.out.println(arr[3]);
		
		//13) sort in ascending order without using arrays or list and display 4th lowest
//		int arr[]= {89,5,67,34,78,98,56,3,90};
//		int temp=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//		System.out.println(arr[i]);
//		}
//		System.out.println(arr[3]);
//		
		ArrayList al = new ArrayList();

		for (int i = 0; i < 10; i++)
			al.add(i);

		System.out.println("Elements of ArrayList : " + al);
		
		Iterator itr = al.iterator();

		System.out.println("Starting Iterator");
		// checking the next element availabilty
		while (itr.hasNext()) {
			// moving cursor to next element
			int i = (Integer) itr.next();

			// getting even elements one by one
			System.out.print(i + " ");

			// Removing odd elements
			if (i % 2 != 0)
				itr.remove();
		}
		System.out.println();
		System.out.println("Elements after remove Operation: " + al);
		
		
		
		
		}
	
		
	
	}
	
	


	


