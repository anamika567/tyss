package java_practice;

import java.util.Scanner;

public class ElementPresentInArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean found = false;

		System.out.println("Enter the no. of element:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element to find:");
		int toFind=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==toFind)
			{
				found=true;
				break;
			}
		}
		
		if(found==true)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}

}
