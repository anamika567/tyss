package ArrayPrograms;

public class SortTheArrayAndFindMissingElement {

	public static void main(String[] args) {

		int ar[]= {23,12,24,10,9};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		System.out.println("Missing Elements:");
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=ar[i]+1;j<ar[i+1];j++)
			{
				System.out.print(j+" ");
			}
		}
	}

}
