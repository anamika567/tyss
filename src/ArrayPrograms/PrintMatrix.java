package ArrayPrograms;

import java.util.Scanner;

public class PrintMatrix {
	
	static int[][] readMat(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int ar[][]=new int[m][n];
		System.out.println("Enter "+m*n+ " Elements");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		return ar;
	}
	
	static void display(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		int ar[][]=readMat();
		System.out.println("Entered Matrix:");
		display(ar);
		
	}

}
