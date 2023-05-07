package assignment;

public class Pattern1 {

	public static void main(String[] args) {
		
//		1 
//		2 3 
//		3 4 5 
//		6 7 8 9 
//		9 10 11 12 13 

		
		int n=5;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			
			if(i%2==0)
			{	
			k--;
			}
			System.out.println();
		}

	}

}
