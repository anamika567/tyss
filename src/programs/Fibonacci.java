package programs;

public class Fibonacci {

	public static void main(String[] args) {
		
	
		int a=0;
		int b=1;
		int c;
		
		for(int i=1;i<=20;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		

	}

}
