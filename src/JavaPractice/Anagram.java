package JavaPractice;

import java.util.Arrays;

public class Anagram {

	static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			Arrays.equals(ch1, ch2);
			return true;
		}
	}
	public static void main(String[] args) {

		boolean status=isAnagram("abcd","bcda");
		if(status==true)
		{
			System.out.println("String is angram");
		}
		else
		{
			System.out.println("String is not anagram");
		}
	}
	

}
