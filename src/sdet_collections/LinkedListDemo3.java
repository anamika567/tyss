package sdet_collections;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {

		LinkedList l=new LinkedList<>();
		
		l.add("dog");
		l.add("cat");
		l.add("tiger");
		l.add("goat");
		
		System.out.println(l);
		
		l.addFirst("lion");
		l.addLast("fox");
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
	}

}
