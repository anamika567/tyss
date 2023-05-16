package programs;

public class FindThe1stMaxNoUsingBBSort {

	public static void main(String[] args) {
		
		int a[]= {12,54,86,45,63,74,99,54,};
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
		System.out.println("The first max no."+a[0]);

	}

}
