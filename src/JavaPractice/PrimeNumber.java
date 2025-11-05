package JavaPractice;

public class PrimeNumber {

	public static void main(String[] args) {

		int x=17;
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
			System.out.println("Prime no.");
		}
		else
		{
			System.out.println("Not prime");
		}
			
	}

}
