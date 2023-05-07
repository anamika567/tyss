package collection_practice;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {
		
		Hashtable<Integer, Object> map=new Hashtable<Integer, Object>();
		map.put(10, 30);
		map.put(80, 90);
	//	map.put(null, 50); // not allowed
	//	map.put(50, null); // not allowed
		map.put(50, "hi");
		map.put(50, "hello"); // duplicate keys are not allowed
		map.put(60, 30); // duplicate values are allowed
		map.put(10, "welcome");
		System.out.println(map.size());
		System.out.println(map.containsKey(50));
		System.out.println(map.containsValue("welcome"));
		map.remove(50);
		System.out.println(map);
		for(Entry<Integer, Object> m : map.entrySet()) // foreach loop to fetch objects 1 by 1 in map
			
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
		

	}

}
