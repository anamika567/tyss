package assignment;

import java.util.TreeSet;

public class MockQuestion {

	public static void main(String[] args) {

		String s[]= {"abhi","karan","anam","jkl","frp","anam","jkl"};
		TreeSet<String> set=new TreeSet<String>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		System.out.print(set);
		
	}

	 

}
