package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(60);
		
		System.out.println(list);
		
		Integer array[]=new Integer[list.size()];
		list.toArray(array);
		
		for(Integer a:array)
		{
			System.out.print(a+" ");
		}
		
		
		
	}

}
