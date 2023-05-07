package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindPositionOfEachCharWithoutDuplicates {

	public static void main(String[] args) {
		
		String a="TestYantra";
		String s=a.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character it :set)
		{
			for(int i=0;i<s.length();i++) {
			if(it==s.charAt(i))
			{
				System.out.println(it+" is in "+(i+1)+" position");
				break;
			}
		}
		
		}
		
		
/*
		String a="testyantra";
		char c[]=a.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<c.length;i++)
		{
			set.add(c[i]);
		}
		for(Character it :set)
		{
			for(int i=0;i<c.length;i++) {
			if(it==c[i])
			{
				System.out.println(c[i]+" is in "+(i+1)+" position");
				break;
			}
		}
		
		}
*/
	}

	}
