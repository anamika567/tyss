package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccurenceEachNosInAnArray {

	public static void main(String[] args) {
		
		int[] a= {2,3,2,1,0,3};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) 
		{
			set.add(a[i]);
		}
		for(Integer inte:set)
		{ 
			int count=0;
			for(int i=0;i<a.length;i++) 
			{
				if(inte==a[i])
				{
					count++;
				
				}
			}
			System.out.println(inte+" is "+count+" times");

		}

		
	}

}
