package JavaPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingCollection {

	public static void main(String[] args) {

		String s="anamikkaa";
		char ch[]=s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		
		for(Character c:set)
		{
			System.out.print(c);
		}
		
	}

}
