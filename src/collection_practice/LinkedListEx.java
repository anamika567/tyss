package collection_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkedListEx {

	public static void main(String[] args) {
		
      LinkedList<Object> list=new LinkedList<Object>();
      
		list.add("10");
		list.add("hi");
		list.add("hi");
		list.add(null);
		list.add(null);
		list.add(30);
		list.add(40);
		
		
		if(list.contains("hi"))
		{
			System.out.println("is present");
		}
		else
		{
			System.out.println("not present");
		}
		
		// fetching element 1 by 1
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		list.remove("hi");
		System.out.println(list);
		System.out.println(list.indexOf(40));
		System.out.println(list.size());
		list.addFirst(5);
		list.addLast(90);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.getLast();
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		Iterator<Object> it=list.iterator(); //fetching objects 1 by 1
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	}

}
