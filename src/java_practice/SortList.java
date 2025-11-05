package java_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		Collections.sort(list);
		//Collections.reverse(list);
		for(String fruit:list)
		{
			System.out.println(fruit);
		}
	}

}
