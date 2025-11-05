package programs;

public class FindBiggestAndSmallest {

	public static void main(String[] args) {

		int a[]= {12,52,74,85,63,15,61,94};
		int big=a[0];
		int small=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
			else if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println(big);
		System.out.println(small);
		
	}

}
