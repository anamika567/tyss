package sdet_java_programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		
		//String s="madam";
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(rev.equals(s))
		{
			System.out.println("Palindrome ");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
