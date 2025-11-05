package sdet_java_programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=sc.nextInt();
		
	//	int x=121;
		int temp=x;
		int rev=0;
		
		while(x!=0)
		{
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
			
		}
		
		if(rev==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
