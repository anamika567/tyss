package sdet_collections;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {

		HashSet<Integer> even=new HashSet<Integer>();
		
		even.add(2);
		even.add(4);
		even.add(6);
		
		System.out.println(even);
		
		HashSet<Integer> number=new HashSet<Integer>();
		number.addAll(even);
		number.add(10);
		
		System.out.println("New HashSet: "+number);
		
		// remove()
		
		number.removeAll(even);
		System.out.println(number);
		
 	}

}
