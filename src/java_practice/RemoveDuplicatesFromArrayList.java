package java_practice;

import java.util.ArrayList;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(50);
		list.add(20);
		list.add(50);
		list.add(90);
		list.add(70);
		
		ArrayList<Integer> newList=new ArrayList<>();
		for(Integer ele:list)
		{
		if(!newList.contains(ele))
		{
			newList.add(ele);
		}
		}
		System.out.println(newList);

	}

}
