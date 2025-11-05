package java_practice;

import java.util.LinkedHashSet;

public class PrintRepeating {

	public static void main(String[] args) {

		String s="testingteste";
		char ch[]=s.toCharArray();
		LinkedHashSet<Character>  set=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		
		for(Character it:set)
		{
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(it==ch[i])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(it+" is repeating "+count+ " times");
			}
		}
		
	}

}
