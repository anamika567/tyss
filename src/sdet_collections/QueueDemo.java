package sdet_collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		PriorityQueue q=new PriorityQueue<>();
		
		// Adding element using add() , offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		
		System.out.println(q); // insertion order preserved and duplicates allowed
		
//		// get head element using element() , peek()
//		System.out.println(q.element()); // if queue is empty it will throw exception
//		System.out.println(q.peek()); // if queue is empty it will returns null
//		
//		// return and remove element from queue  remove(), poll()
//		System.out.println(q.remove());
//		System.out.println(q);
//		
//		System.out.println(q.poll());
//		System.out.println(q);
		
		Iterator it =q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


		for(Object e:q)
		{
			System.out.println(e);
		}
		
		
		
	} 

}
