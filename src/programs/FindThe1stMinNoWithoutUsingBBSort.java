package programs;

public class FindThe1stMinNoWithoutUsingBBSort {

	public static void main(String[] args) {
		
		int[] a= {7,2,1,0};
		int fmin=a[0];
		for(int i=1;i<a.length;i++)
		{
				if(fmin>a[i])
				{
					fmin=a[i];
				}
				
		}
		System.out.println("The 1st min no in array is="+fmin);
		

	}

}
