package sdet_collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList al=new ArrayList<>();
		
		al.add("A");
		al.add("D");
		al.add("C");
		al.add("B");
		
      ArrayList al2=new ArrayList<>();
		
       al2.addAll(al);
       System.out.println(al2);
       
       al2.removeAll(al);
       System.out.println(al2);
       
       // sort -- Collections.sort();
       System.out.println("Element in arrayList: "+al);
       Collections.sort(al); 
       System.out.println("Element after sorting: "+al);
       
       // sort in reverse order
       Collections.sort(al,Collections.reverseOrder());
       System.out.println("Element in reverse order: "+al);
       
       // shuffling --- Collections.shuffle();
       Collections.shuffle(al);
       System.out.println("Element after shuffling: "+al);
		
	}

}
