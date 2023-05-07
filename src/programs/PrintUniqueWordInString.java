package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueWordInString {

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
			for(int i=0;i<st.length;i++)
			{
				if(it==st[i])
				{
					System.out.print(st[i]+" ");
				}
			}
		}

	}

}
