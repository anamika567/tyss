package java_practice;

import java.util.Scanner;

public class OccurenceOfParticularCharInString {

	public static void main(String[] args) {

		String s="keerthana";
		char ch[]=s.toCharArray();
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character to find: ");
		char toFind=sc.next().charAt(0);
		
		for(int i=0;i<ch.length;i++)
		{
			if(toFind==ch[i])
				count++;
		}
		System.out.println("Character "+toFind+" is "+count+" times");
		
	}

}
