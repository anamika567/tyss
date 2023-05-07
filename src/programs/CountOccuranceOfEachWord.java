package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CountOccuranceOfEachWord {

	public static void main(String[] args) {
		
		String str="I am from from am Testyantra";
		String st[]=str.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++)
		{
			set.add(st[i]);

		}
		for(String it:set)
		{
			int count=0;
			for(int i=0;i<st.length;i++)
			{
				if(it.equals(st[i]))
				{
                    count++;
				}
			}
			System.out.println(it+" is "+count+" times");

		}
	}

}
