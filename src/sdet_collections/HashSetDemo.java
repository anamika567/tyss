package sdet_collections;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class HashSetDemo {

	public static void main(String[] args) {

		// HashSet hs=new HashSet(); //default capacity is 16 and load factor is 0.75
		
		// HashSet hs=new HashSet(100); // initial capacity is 100
		
		// HashSet hs=new HashSte(100, (float) 0.90);
		
		// HashSet<Integer> hs=new HashSet<Integer>();
		
		HashSet hs=new HashSet<>();
		
		hs.add("welcome");
		hs.add(100);
		hs.add('A');
		hs.add(16.5);
		hs.add(null);
		hs.add(true);
		
		System.out.println(hs); // insertion order not preserved
		
		//remove()
		hs.remove(16.5); // value
		System.out.println("After removing: "+hs);
		
		// contains()
		System.out.println(hs.contains("welcome"));
		
		// isEmpty()
		System.out.println(hs.isEmpty());
		
		System.out.println("---------------------");
		
		// reading elements using foreach loop
		for(Object e:hs)
		{
			System.out.println(e);
		}
		
		System.out.println("-------------------------");
		
		// reading using iterator
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
