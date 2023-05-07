package assignment;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int getReverse(int x) {
		
		int rev=0;
		while(x!=0)
		{
		int d=x%10;
		rev=rev*10+d;
		x=x/10;
		}
		return rev;
		
	}

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rs=getReverse(n);
		System.out.println("reverse is:"+rs);
	}

}
