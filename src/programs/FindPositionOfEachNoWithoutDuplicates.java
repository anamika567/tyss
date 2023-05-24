package programs;

import java.util.LinkedHashSet;

public class FindPositionOfEachNoWithoutDuplicates {

	public static void main(String[] args) {
		
		int[] a= {2,3,1,6,2,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer in :set)
		{
			for(int i=0;i<a.length;i++) 
			{
			if(in==a[i])
			{
				System.out.println(a[i]+" is in "+(i+1)+" position");
				break;
			}
		}
		}
	}

}
