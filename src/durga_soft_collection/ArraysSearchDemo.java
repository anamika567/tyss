package durga_soft_collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchDemo {

	public static void main(String[] args) {

		int a[]= {10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
		
		String s[]= {"A","Z","B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "Z"));
		System.out.println(Arrays.binarySearch(s,"S"));
		
		Arrays.sort(s, new createComparator());
		System.out.println(Arrays.binarySearch(s, "Z", new createComparator()));
		System.out.println(Arrays.binarySearch(s, "S", new createComparator()));
		System.out.println(Arrays.binarySearch(s, "N"));


	}

}

class createComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
		
	}
}