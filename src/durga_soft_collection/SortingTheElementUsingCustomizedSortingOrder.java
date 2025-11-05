package durga_soft_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingTheElementUsingCustomizedSortingOrder {

	public static void main(String[] args) {

		ArrayList l=new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		System.out.println("Before sorting :"+l); // Before sorting :[Z, A, K, L]
		Collections.sort(l, new newMyyComparator());
		System.out.println("After sorting: "+l);  //After sorting: [Z, L, K, A]
	}

}

class newMyyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}