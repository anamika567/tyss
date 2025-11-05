package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateTheMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "shikha");
		map.put(2, "niketa");
		map.put(3, "neha");
		map.put(4, "Ekta");
		
		System.out.println(map.get(2));

		System.out.println(map.size());
		
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry ent=(Map.Entry) itr.next();
			System.out.println(ent.getKey()+"  "+ent.getValue());
		}
		
		System.out.println("Foreach loop");
		
		for(Map.Entry ent: map.entrySet())
		{
			System.out.println(ent.getKey()+"  "+ent.getValue());
		}
		
		
	}

}
