package sdet_collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		String arr[]= {"Dog","Cat","Goat","Camel"};
		for(String a:arr)
		{
			System.out.println(a);
		}
		
		ArrayList al=new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);
		
		
	}

}
