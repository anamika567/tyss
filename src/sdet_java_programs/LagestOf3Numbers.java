package sdet_java_programs;

import java.util.Scanner;

public class LagestOf3Numbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		// logic 1.
//		if(a>b && a>c)
//		{
//			System.out.println(a+" is largest no.");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println(b+" is largest no.");
//		}
//		else
//		{
//			System.out.println(c+" is largest no.");
//		}
//		
		// logic 2. Using ternary operator
		int large =a>b?a:b;
		int largest=large>c?large:c;
		
		System.out.println(largest+" is largest");
		
	}

}
