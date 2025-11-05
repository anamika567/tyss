package sdet_java_programs;

import java.util.Random;

public class GenerateRandomNumbersAndString {

	public static void main(String[] args) {

		// logic 1: Random class
		
		Random rand=new Random();
		int random=rand.nextInt(100);
		System.out.println(random);
		
		// logic2: Math class
		
		System.out.println(Math.random());
		
	}

}
