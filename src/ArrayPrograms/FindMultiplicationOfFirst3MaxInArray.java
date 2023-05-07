package ArrayPrograms;

public class FindMultiplicationOfFirst3MaxInArray {

	public static void main(String[] args) {

		int a[]= {2,4,1,5,6,3};
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
		
		int prod=1;
		int count=3;
		for(int i=0;i<count;i++)
		{
			prod=prod*a[i];
		}
		System.out.println(prod);
	}

}
