package programs;

import java.util.HashSet;

public class Interview {

	public static void main(String[] args) {

		String s="aabbccdd $ %";
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character c:set)
		{
			System.out.println(c);
		}
	}

}
