package programs;

import java.util.LinkedHashSet;

public class CountHowManyTimesDuplicateCharIsRepeating {

	public static void main(String[] args) {
		String a="TestYantra";
		String s=a.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character it:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++) 
			{
				if(it==s.charAt(i))
				{
					count++;
				
				}
			}
			if(count>1) 
			{
			 System.out.println(it+" is repeating "+count+" times");
			}
		}
	
		/*
		String a="testyantra";
		char c[]=a.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<c.length;i++)
		{
			set.add(c[i]);
		}
		
		for(Character it:set)
		{
			int count=0;
			for(int i=0;i<c.length;i++) 
			{
				if(it==c[i])
				{
					count++;
				
				}
			}
			if(count>1) 
			{
			 System.out.println(it+" is repeating "+count+" times");
			}
		}
		*/
	}
}