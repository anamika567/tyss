package StringDurgaSoft;

import java.util.Scanner;

public class StringProgram1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city name:");
		//String name=sc.nextLine();
		String name=sc.nextLine().toLowerCase().trim();
	
		if(name.equals("hyderabad"))
		{
			System.out.println("Welcome to Hyderabad");
		}
		else if(name.equals("bangalore"))
		{
			System.out.println("Welcome to Bangalore");
		}
		else if(name.equals("pune"))
		{
			System.out.println("Welcome to Pune");
		}
		else if(name.equals("chennai"))
		{
			System.out.println("Welcome to Chennai");
		}
		else
		{
			System.out.println("Please enter valid city name:");
		}
		
	}

}
