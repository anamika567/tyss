package durga_soft_collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Object> l=new LinkedList<Object>();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		l.set(0, "software");
		l.set(0, "venky");
		l.removeLast();
		l.addFirst("ccc");
		System.out.println(l);
		
		
	}

}
