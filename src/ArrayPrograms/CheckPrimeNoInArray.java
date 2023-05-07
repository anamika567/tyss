package ArrayPrograms;

public class CheckPrimeNoInArray {

	public static void main(String[] args) {

		int a[]= {21,7,19,13,14,5,16};
		for(int i=0;i<a.length;i++)
		{
			int x=a[i];
			boolean flag=true;
			for(int j=2;j<=x/2;j++)
			{
				if(x%j==0)
				{
					flag= false;
				}
			}
			
			if(flag==true)
			{
				System.out.println(x+" prime no.");
			}
			
		}
		
	}

}
