package programs;

public class FindThe1stMaxWithoutUsingBBSort {

	public static void main(String[] args) {
		
		int[] a= {5,6,4,3};
		int fmax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				fmax=a[i];
				
			}
		}
		System.out.println("The 1st max no in array is="+fmax);

	}

}
