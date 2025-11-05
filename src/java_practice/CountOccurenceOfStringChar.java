package java_practice;

import java.util.HashMap;

public class CountOccurenceOfStringChar {

	public static void main(String[] args) {

		String s="anamika";
		char ch[]=s.toCharArray();
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		for(Character c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
