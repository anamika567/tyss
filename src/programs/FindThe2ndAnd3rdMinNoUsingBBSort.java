package programs;

public class FindThe2ndAnd3rdMinNoUsingBBSort {

	public static void main(String[] args) {
		
		int[] a = {6,5,9,3};
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
		System.out.println("The 2nd min no.="+a[1]);
		System.out.println("The 3rd min no.="+a[2]);
	
	}

}
