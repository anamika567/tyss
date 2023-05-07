package collection_practice;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<Object> set=new TreeSet<Object>();
		set.add(50);
		set.add(40);
		set.add(10);
		set.add(60);
		set.add(10);
	//	set.add(null); nullPointer exception

		System.out.println(set);
		System.out.println(set.descendingSet());
		System.out.println(set.first()); // first object
		System.out.println(set.last());  // last object
		System.out.println(set.higher(40)); // after 40-50
		System.out.println(set.lower(40)); // before 40-10
		System.out.println(set.headSet(50)); //objects before 50(10,40)
		System.out.println(set.tailSet(40)); // objects after 40(40,50,60)
		System.out.println(set.subSet(10, 60));	 // between 10 and 60

	}

}
