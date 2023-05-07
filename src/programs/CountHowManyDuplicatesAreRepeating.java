package programs;

import java.util.LinkedHashSet;

public class CountHowManyDuplicatesAreRepeating {

	public static void main(String[] args) {
		
		int[] a= {2,1,4,3,2,1,3};
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
			if(count>1) 
			{
			 System.out.println(inte+" is repeating "+count+" times");
			}

		}
	}

}
