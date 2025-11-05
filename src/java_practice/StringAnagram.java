package java_practice;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		String s1="abcD";
		String s2="DBca";
		
		String str1=s1.toLowerCase();
		String str2=s2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Given strings are not anagram");
		}
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)==true)
		{
			System.out.println("Strings are equal and anagram");
		}
		else
		{
			System.out.println("Strings are not equal and anagram");
		}
		
		
	}

}
