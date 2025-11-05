package sdet_java_programs;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingUsingBuiltInMethods {

	public static void main(String[] args) {

		int a[]= {20,45,63,2,21,3,15};
		
//		System.out.println("Element before sorting:"+Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Element after sorting:"+Arrays.toString(a));
		
		// reverse order
		Integer b[]= {20,45,63,2,21,3,15};
		System.out.println("Element before sorting:"+Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("Element after sorting:"+Arrays.toString(b));

	}

}
