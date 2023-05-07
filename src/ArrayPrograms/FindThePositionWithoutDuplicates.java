package ArrayPrograms;

import java.util.LinkedHashSet;

public class FindThePositionWithoutDuplicates {

	public static void main(String[] args) {

		int a[]= {2,3,4,3,2,5,4};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		
		for(Integer inte:set)
		{
			for(int i=0;i<a.length;i++)
			{
				if(inte==a[i])
				{
					System.out.println(inte +" is in "+(i+1)+" position");
					break;
				}
			}
		}
	}

}
