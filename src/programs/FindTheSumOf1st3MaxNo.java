package programs;

public class FindTheSumOf1st3MaxNo {

	public static void main(String[] args) {

		int[] a= {5,2,1,3};
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
       int sum=0;
       int count=3;
       for(int i=0;i<count;i++)
       {
    	   sum=sum+a[i];
       }
       System.out.println("The sum of first 3 max no. is="+sum);
	}

}
