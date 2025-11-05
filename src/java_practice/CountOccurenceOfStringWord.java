package java_practice;

import java.util.HashMap;

public class CountOccurenceOfStringWord {

	public static void main(String[] args) {

		String s="practice makes perfect practice makes";
		String st[]=s.split(" ");
		HashMap<String , Integer> map=new HashMap<String,Integer>();
		for(String w:st)
		{
			if(map.containsKey(w))
			{
				map.put(w, map.get(w)+1);
			}
			else
			{
				map.put(w, 1);
			}
		}
		
		System.out.println(map);
	}

}
