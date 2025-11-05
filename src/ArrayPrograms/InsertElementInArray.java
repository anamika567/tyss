package ArrayPrograms;

import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Array is:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
