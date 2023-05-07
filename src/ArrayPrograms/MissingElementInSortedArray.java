package ArrayPrograms;

public class MissingElementInSortedArray {

	public static void main(String[] args) {

		int ar[]={8,12,25,26,27,30};
		System.out.println("Missing element in sorted array:");
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=ar[i]+1;j<ar[i+1];j++)
			{
				System.out.print(j+" ");
			}
		}
		
		
	}

}
