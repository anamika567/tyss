package sdet_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		
		ArrayList al=new ArrayList<>();
		
		al.add(100);
		al.add("welcome");
		al.add(15.2);
		al.add(true);
		al.add('A');
		System.out.println(al);
		
		// size()
		System.out.println("Number of element in arryList"+al.size());
		
		// remove()
		
		al.remove(1); // by using index
		//al.remove("welcome"); // by using element
		System.out.println("After removing :"+al);
		
		// insert a new element
		
		al.add(2,"python");
		System.out.println("After adding:"+al);
		
		// retreive specific element
		
		System.out.println(al.get(2));

		// change element/object
		
		al.set(1, 200);
		System.out.println("After change:"+al);
		
		// search -- contains() return true/false
		
		System.out.println(al.contains("c++"));
		
		// isEmpty()
		System.out.println(al.isEmpty());
		
		System.out.println("-------------------------");
		
		// reading element using for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("---------------------");
		
		// reading element using foreach loop
		for(Object e:al)
		{
			System.out.println(e);
		}
		
		System.out.println("-----------------------");
		
		// reading element using iterator
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
