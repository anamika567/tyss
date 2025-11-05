package sdet_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l=new LinkedList<>();
		
		l.add(50);
		l.add("A");
		l.add("welcome");
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		
		System.out.println("Number of element in List"+l.size());
		
		// remove
		//l.remove(2);
		l.remove("A");
		System.out.println("After removing element from the list:"+l);
		
		// insert/adding element in middle
		l.add(3, "java");
		System.out.println("After inserting the element in the list:"+l);
		
		// retreiving value/object
		System.out.println(l.get(3));
		
		// change the value
		l.set(2, "python");
		System.out.println("After changing the value:"+l);
		
		// contains()
		System.out.println(l.contains("java"));
		System.out.println(l.contains("php"));
		
		// isEmpty()
		System.out.println(l.isEmpty());
		
		// reading element using for loop
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("--------------------------------");
		
		// using foreach loop
		for(Object e:l)
		{
			System.out.println(e);
		}
		
		System.out.println("-----------------------------");
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
