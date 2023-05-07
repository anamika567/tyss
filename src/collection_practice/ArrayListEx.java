package collection_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("10");
		list.add("hi");
		list.add("hi");
		list.add(null);
		list.add(null);
		list.add(30);
		list.add(40);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(40);
		list1.add(4);
		list1.add(30);
		list1.add(10);
		list1.add(60);
		Collections.sort(list1);
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		if(list.contains("hi"))
		{
			System.out.println("is present");
		}
		else
		{
			System.out.println("not present");
		}
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		list.add(3,"hello");
		list.remove(4);
		System.out.println(list.get(5));
		System.out.println(list.remove(new Integer(60)));
		System.out.println(list.set(6, "bye"));
		System.out.println(list.size());
		System.out.println(list);
		
		
	}

}
