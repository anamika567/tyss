package java_practice;

import java.util.LinkedHashSet;

public class PrintDuplicateElementInArray {

	public static void main(String[] args) {

		int a[]= {12,53,12,65,53};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
