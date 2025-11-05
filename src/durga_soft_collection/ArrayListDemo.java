package durga_soft_collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> l=new ArrayList<Object>();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"M");
		l.add("N");
		System.out.println(l);
		
	}

}
