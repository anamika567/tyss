package ArrayPrograms;

public class MergeTwoArray {

	public static void main(String[] args) {

		int x[]= {5,3,8,7,9};
		int y[]= {14,23,21,12};
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
	}

}
