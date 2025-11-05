package sdet_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

//		//HashMap<Integer, String> n=new HashMap<Integer,String>();
//		HashMap m=new HashMap<>();	
		
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(101,"David");
		m.put(102, "Mary");
		m.put(103, "Ketty");
		m.put(104, "Jhon");
		m.put(105, "Sandy");
		m.put(103, "jk");
		m.put(106,"David");
		
	   System.out.println(m);
	 
	   System.out.println(m.get(105));
	   
	   m.remove(103);
	   System.out.println(m);
	   
	   System.out.println(m.containsKey(103));
	   
	   System.out.println(m.containsValue("jk"));
	   
	   System.out.println(m.isEmpty());
	   
	   System.out.println(m.keySet()); // returns all the keys as set
	   
	   for(Object i:m.keySet())
	   {
		   System.out.println(i);
	   }
	   
	   System.out.println("-----------------------------");
       System.out.println(m.values()); // returns all the values as collection
       System.out.println("-------------------------------");
   
       for(Object i:m.values())
       {
	     System.out.println(i);
       }
       System.out.println("--------------------------");
      
	   System.out.println(m.entrySet()); // returns all the entries as set 
	   System.out.println("-------------------------");
	   for(Object i:m.keySet())
	   {
	   System.out.println(i+"     "+m.get(i));
	   }
	   System.out.println("------------------------------");
	   
	   // entry method
	   for(Map.Entry entry:m.entrySet())
	   {
		   System.out.println(entry.getKey()+"         "+ entry.getValue());
		   
	   }
	   System.out.println("----------------------------------");
	   
	   // iterator
	   
	   Set s=m.entrySet();
	   
	   Iterator itr=s.iterator();
	   
	   while(itr.hasNext())
	   {
		   Map.Entry entry=(Entry) itr.next();
		   System.out.println(entry.getKey()+"         "+entry.getValue());
	   }
	   
	   
	   
	   
	   
	   
		
	}

}
