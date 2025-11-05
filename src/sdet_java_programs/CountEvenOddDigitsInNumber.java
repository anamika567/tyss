package sdet_java_programs;

public class CountEvenOddDigitsInNumber {

	public static void main(String[] args) {

		int n=15638742;
		int ec=0;
		int oc=0;
		
		while(n>0)
		{
			int rem=n%10;
			
			if(rem%2==0)
			{
				ec++;
			}
			else
			{
				oc++;
			}
			
			n=n/10;
		}
		System.out.println("Even digits:"+ec);
		System.out.println("Odd digits:"+oc);
		
	}

}
