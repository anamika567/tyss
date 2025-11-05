package java_practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesUsingMap {

	public static void main(String[] args) {

		String s="testdata";
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character,Integer>();
		char charArray[]=s.toCharArray();
		for(char c:charArray)
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
		
		Set<Map.Entry<Character,Integer>> set=map.entrySet();
		for(Map.Entry<Character, Integer> entry:set)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
		}
		
	}

}
