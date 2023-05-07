package ArrayPrograms;

import java.util.LinkedHashSet;

public class OccurenceOfEachNoInArray {

	public static void main(String[] args) {

		int a[]= {2,1,3,2,5,6,4};
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
			System.out.println(inte +" is "+count+ "times");
			
		}
	}

}
