package programs;

public class CheckPrimeNoInArray {

	public static void main(String[] args) {

		int n[]= {12,15,45,65,75,48,49,13,17};

		for(int i=0;i<n.length;i++)
		{
			int x=n[i];
			boolean flag=true;
			for(int j=2;j<=x/2;j++)
			{
				if(x%j==0)
				{
					flag=false;
				}
				
			}
			
			if(flag==true)
			{
			 System.out.println(x+" is prime");
			}
		}
	}

}
