package assignment;

import java.util.Arrays;

public class MergeTwoArrayAndSort {

	public static void main(String[] args) {
		
		int x[]= {4,2,6,8};
		int y[]= {5,23,12,14};
		int z[]=new int[x.length+y.length];
		
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			z[x.length+i]=y[i];
		}

		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
		
		// or by using sort method
		Arrays.sort(z);
		
		// by using bubble sort
		
//		for(int i=0;i<z.length;i++)
//		{
//			for(int j=i+1;j<z.length;j++)
//			{
//				if(z[i]>z[j])
//				{
//					int temp=z[i];
//					z[i]=z[j];
//					z[j]=temp;
//					
//				}
//			}
//		}
		System.out.println();
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}

}
