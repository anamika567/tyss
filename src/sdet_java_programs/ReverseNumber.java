package sdet_java_programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		
		//int n=56987;
		
		//logic 1. Using algorithm
		int rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+n%10;
			n=n/10;
		}
		
		// logic 2. Using StringBuffer 
//		StringBuffer sb=new StringBuffer(String.valueOf(n));
//		StringBuffer rev=sb.reverse();
//		
		
		// logic 3. Using StringBuilder
//		StringBuilder sbl=new StringBuilder();
//		sbl.append(n);
//		StringBuilder rev = sbl.reverse();
				
		System.out.println("Reverse of Number is:"+rev);
		
		
	}
	

}
