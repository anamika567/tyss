package durga_soft_collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet t=new TreeSet<>();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		//t.add(new Integer(10)); // Classcast exception
		//t.add(null);           // NullPointer Exception
		System.out.println(t); // [A, B, L, Z, a]

	}

}
