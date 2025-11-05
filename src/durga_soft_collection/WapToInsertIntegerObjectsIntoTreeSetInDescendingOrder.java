package durga_soft_collection;

import java.util.Comparator;
import java.util.TreeSet;

public class WapToInsertIntegerObjectsIntoTreeSetInDescendingOrder {

	public static void main(String[] args) {

		TreeSet t=new TreeSet(new MyComparator()); // sorting the elements in descending order we have to
		                                             //   implement comparator for customized sorting.
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}

class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer) obj1;
		Integer I2=(Integer) obj2;
		
		if(I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else
		return 0;
		
		
	}
	
	
//	Possible implementation of comapare() method
//	public int compare(Object obj1,Object obj2)
//	{
//		Integer I1=(Integer) obj1;
//		Integer I2=(Integer) obj2;
//		
//		return I1.compareTo(I2); // Natural sorting
//		return -I1.compareTo(I2); // Descending order
//		return I2.compareTo(I1);  //Descending order
//		return -I2.compareTo(I1); // Ascending order
//		return +1;                // Insertion order
//		return -1;                // reverse insertion order
//		return 0;                 // Insert Only first element
//	}
	
}
