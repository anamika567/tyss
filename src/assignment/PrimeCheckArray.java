package assignment;

public class PrimeCheckArray {

	public static void main(String[] args) {
		
		int n[]= {7,15,24,25,13,17,19,41};//7 13 17 19 41
		for(int i=0;i<n.length;i++)
		{
		int x = n[i];
		boolean flag=true;
		for(int j=2;j<=x/2;j++)
		{
			if(x%j==0)
			{
				flag=false;
			}
		
		}
		if (flag==true) {
		
			System.out.println(x+" is prime");
		}
	}
	}

}
