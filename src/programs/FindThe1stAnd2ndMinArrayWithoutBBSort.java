package programs;

public class FindThe1stAnd2ndMinArrayWithoutBBSort {

	public static void main(String[] args) {
		
		int[] a= {0,5,3,4};
		int fmin=a[0];
		int smin=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(fmin>=a[i])
			{
				if(a[i]!=fmin)
				{	
				smin=fmin;
				}
				fmin=a[i];
				
			}
			else if(fmin==smin||a[i]<smin)
			{
				smin=a[i];
			}
			
		}
		System.out.println("first min is ="+fmin);
		System.out.println("Second min is ="+smin);


	}

}
