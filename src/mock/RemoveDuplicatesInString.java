package mock;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {

		String s="khatam ta ta bye bye";
		String st[]=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++)
		{
			set.add(st[i]);
		}
		
		for(String it:set)
		{
			System.out.print(it+" ");
		}
		
	}

}
