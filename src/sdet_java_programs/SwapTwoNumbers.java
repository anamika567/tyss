package sdet_java_programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		// logic 1. Using 3rd variable
		int temp=a;
		       a=b;
		       b=temp;
		       
		// logic 2. Without using 3rd variable
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		// logic 3. Using * and / operator
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		// logic 4. USing bitwise XOR (^)
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		
		// logic 5.
//		b=a+b-(a=b);
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
