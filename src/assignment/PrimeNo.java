package assignment;

import java.util.Scanner;

public class PrimeNo {

	public static boolean isPrime(int n) {
		
		if(n==0||n==1)
			return false;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				
				return false;
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		boolean res=isPrime(x);
		if(res==true)
		{
		System.out.println("prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
	}

}
