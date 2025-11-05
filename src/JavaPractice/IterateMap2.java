package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMap2 {

	public static void main(String[] args) {

		HashMap<Integer, String> map=new HashMap<>();
		map.put(10, "java");
		map.put(12, "c++");
		map.put(15, "python");
		map.put(20, "c");
		
		for(Map.Entry ent:map.entrySet())
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		System.out.println("using iterator");
		
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry ent=(Map.Entry) itr.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}

}
