package java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {

	public static void main(String[] args) {

//		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "D"));
//	      System.out.println("List: " + list);
//	      Set<String> set = new HashSet<String>(list);
//	      System.out.println("Set: " + set);
//	      
		
		// or 
		
		List< String> l=new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("L");
		l.add("A");
		l.add("P");
		System.out.println(l);
		Set<String> s=new HashSet<String>(l);
		System.out.println(s);
	}

}
