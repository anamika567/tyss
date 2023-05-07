package ArrayPrograms;

public class MergeTwoArrayAndSort {

	public static void main(String[] args) {

		int x[]= {5,6,8,2,9};
		int y[]= {23,41,62,35};
		int z[]=new int[x.length+y.length];
		
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		
		for(int i=0;i<y.length;i++)
		{
			z[x.length+i]=y[i];		
		}
		
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
		
		for(int i=0;i<z.length;i++)
		{
			for(int j=i+1;j<z.length;j++)
			{
				if(z[i]>z[j])
				{
					int temp=z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting array is:");
		
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}

}
