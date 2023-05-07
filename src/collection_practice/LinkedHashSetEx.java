package collection_practice;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		set.add(40);
		set.add("hi");
		set.add("hello");
		set.add("hi"); // duplicates not allowed
		set.add(null);
		set.add(null); // allows only one null
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("hi"));
		System.out.println(set.remove(null));
		System.out.println(set);

		
	}

}
