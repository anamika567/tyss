package durga_soft_collection;

import java.util.TreeMap;

public class TreeMapDemo {

	// Default Natural Sorting
	public static void main(String[] args) {

		TreeMap t=new TreeMap<>();
		t.put(100, "ZZZ");
		t.put(103, "YYY");
		t.put(101, "XXX");
		t.put(104, 106);
		//t.put("FFF", "XXX"); // Classcast Exception
		//t.put(null, "XXX");  // NullPointer Exception
		System.out.println(t);
	
	}

}
