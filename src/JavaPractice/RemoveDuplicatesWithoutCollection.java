package JavaPractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicatesWithoutCollection {

	public static void main(String[] args) {

		int b[]= {2,5,3,4,2,5,7,8};
		HashMap<Integer, Integer> map=new HashMap<>();
		for(Integer i:b)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		
		Set<Entry<Integer, Integer>> set=map.entrySet();
		for(Entry<Integer,Integer> ent:set)
		{
			if(ent.getValue()==1)
			{
				System.out.print(ent.getKey()+" ");
			}
		}
	}

}
