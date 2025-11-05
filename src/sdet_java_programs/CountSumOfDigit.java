package sdet_java_programs;

public class CountSumOfDigit {

	public static void main(String[] args) {

		int n=4563;
		int sum=0;
		
		while(n>0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("Sum of digits:"+sum);
	}

}
