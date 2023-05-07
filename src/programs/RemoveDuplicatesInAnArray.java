package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInAnArray {

	public static void main(String[] args) {
		
		int[] a= {2,3,2,1,0,3,4,5};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) 
		{
			set.add(a[i]);
		}
		for(Integer inte:set)
		{
			System.out.print(inte+" ");
		}
      /*
		int[] a= {2,3,2,1,0,3};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) 
		{
			set.add(a[i]);
		}
		System.out.println(set);
*/
	}

}
