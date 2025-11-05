package java_practice;

import java.util.HashMap;

public class CountOccurenceOfNumber {

	public static void main(String[] args) {

		int n[]= {22,33,45,11,22,33,55,16,45,55,16};
		HashMap<Integer , Integer> map=new HashMap<Integer ,Integer>();
		for(Integer d:n)
		{
			if(map.containsKey(d))
			{
				map.put(d, map.get(d)+1);
			}
			else
			{
				map.put(d, 1);
			}
		}
		
		System.out.println(map);

	}

}
