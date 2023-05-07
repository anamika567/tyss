package programs;

public class FindTheMultiplicationOf1st3MinNo {

	public static void main(String[] args) {
		
		int[] a= {5,2,11,3};
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
       int prod=1;
       int count=3;
       for(int i=0;i<count;i++)
       {
    	   prod=prod*a[i];
       }
       System.out.println("The product of first 3 min no. is="+prod);




	}

}
