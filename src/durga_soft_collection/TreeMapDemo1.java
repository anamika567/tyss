package durga_soft_collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {

	// Customized Sorting
	public static void main(String[] args) {

		TreeMap t=new TreeMap<>(new NewwComparator());
		t.put("XXX", 10);
		t.put("AAA", 20);
		t.put("ZZZ", 30);
		t.put("LLL", 40);
		System.out.println(t);
		
	}

}

class NewwComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
				
	}

	
}