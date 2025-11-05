package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Original array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		Arrays.sort(a);
//		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
		System.out.println("After sorting:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
