package sdet_collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		LinkedList l=new LinkedList<>();
		
		l.add("A");
		l.add("D");
		l.add("M");
		l.add("K");
		l.add("G");
		
		LinkedList l2=new LinkedList<>();
		
		l2.addAll(l);
		System.out.println(l2);
		
		l2.removeAll(l);
		System.out.println(l2);
		
		// sort
		Collections.sort(l);
		System.out.println("After sorting elements:"+l);
		
		//reverse order
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("Reverse order:"+l);
		
		//shuffling
		Collections.shuffle(l);
		System.out.println("After Shuffling:"+l);
		
		
	}

}
