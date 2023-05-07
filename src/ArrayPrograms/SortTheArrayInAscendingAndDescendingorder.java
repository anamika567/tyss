package ArrayPrograms;

public class SortTheArrayInAscendingAndDescendingorder {

	public static void main(String[] args) {

		int a[]= {2,6,4,8,23,12,10,42};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascendinhg order:");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("decendinhg order:");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		
	}

}
