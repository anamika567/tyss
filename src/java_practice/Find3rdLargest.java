package java_practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Find3rdLargest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of element:");
		int n=sc.nextInt();
		Integer a[]=new Integer[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(n-3);
		System.out.println("3rd largest elemnt:" +element);
		
	}

}
