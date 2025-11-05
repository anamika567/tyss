package sdet_java_programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		
	//	String s="ABCD";
		
		// logic 1. Using variable
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		// logic 2. Using Character array
		
//		char ch[]=s.toCharArray();
//		for(int i=ch.length-1;i>=0;i--)
//		{
//			System.out.print(ch[i]);
//		}
		
		// logic 3. Using StringBuffer Class
//		StringBuffer sb=new StringBuffer(s);
//		System.out.println(sb.reverse());
//		
		
	}

}
