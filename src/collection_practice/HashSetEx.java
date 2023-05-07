package collection_practice;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<Object> set=new HashSet<Object>();
		set.add(40);
		set.add("hi");
		set.add("hello");
		set.add("hi"); // duplicates not allowed
		set.add(null);
		set.add(null); //allows only one null
		System.out.println(set.size());
		System.out.println(set.contains("hello"));
		System.out.println(set.isEmpty());
		ArrayList<Object> list=new ArrayList<Object>(set);
	    list.add(7);
	    list.add("bye");
	    list.add(7);
	    list.add(null);
	    System.out.println(list);

	    
		
		

	}

}
