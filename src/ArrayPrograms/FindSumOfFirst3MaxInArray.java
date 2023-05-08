package ArrayPrograms;

public class FindSumOfFirst3MaxInArray {

	public static void main(String[] args) {

		int a[]= {22,25,16,18,29,21,10};
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
		System.out.println(sum);

	}

}
