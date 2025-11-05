package sdet_java_programs;

import java.util.HashSet;

public class FindDuplicatesElementInArray {

	public static void main(String[] args) {

		String arr[]= {"java","c","c++","java","python"};
		boolean flag=false;
		
		// logic 1:
		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println("Found duplicate element:"+arr[i]);
//					flag=true;
//				}
//			}
//		}
//		
//		if(flag==false)
//		{
//			System.out.println("Duplicate element not found");
//		}
//		
		
		
		
		//logic 2:
		
		HashSet<String> set=new HashSet<>();

		for(String l:arr)
		{
			if(set.add(l)==false)
			{
				System.out.println("Duplicate element is:"+l);
				flag=true;
			}
			
		}
		if(flag==false) 
		{
			System.out.println("Duplicate element is not found");
		}
	}

}
