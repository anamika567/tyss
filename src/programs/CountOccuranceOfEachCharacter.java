package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CountOccuranceOfEachCharacter {

	public static void main(String[] args) {
		
		String a="TestYantra";
		String s=a.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
		}
		for(Character it:set ) 
		{
			int count=0;
				for(int i=0;i<s.length();i++) 
				{
					if(it==s.charAt(i))
					{
						count++;
					}
				}
				System.out.println(it+" is "+count+" times");
		}
			}

}
