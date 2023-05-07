package ArrayPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {

		int a[]= {2,5,3,6,2,4,5};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		
		for(Integer inte:set)
		{
			System.out.print(inte +" ");
		}
	}

}
