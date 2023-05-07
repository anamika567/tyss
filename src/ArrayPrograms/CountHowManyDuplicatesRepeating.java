package ArrayPrograms;

import java.util.LinkedHashSet;

public class CountHowManyDuplicatesRepeating {

	public static void main(String[] args) {

		int a[]= {2,3,5,8,9,7,2,3,7};
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
				System.out.println(inte +" is repeating " +count+ " times");
			}
		}
		
		
	}

}
