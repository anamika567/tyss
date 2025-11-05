package sdet_java_programs;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// logic 1:
		
		int n=19;
		
		boolean flag=true;
		
		for(int j=2;j<=n/2;j++)
		{
			if(n%j==0)
			{
				flag=false;
			}
		}
		
		if(flag==true)
		{
			System.out.println(n+" is prime number");
		}
		else
		{
			System.out.println(n+" is not prime number");
		}
		
		
		// logic 2:
		
//		int num=19;
//		int count=0;
//		
//		if(num>1)
//		{
//			for(int i=1;i<=num;i++)
//			{
//				if(num%i==0)
//				{
//					count++;
//				}
//			}
//			
//			if(count==2)
//			{
//				System.out.println("Prime number");
//			}
//			else
//			{
//				System.out.println("Not Prime number");
//			}
//		}
//		else
//		{
//			System.out.println("Not prime number");
//		}
		
	}

}
