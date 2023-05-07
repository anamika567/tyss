package assignment;

public class Pattern2 {

	public static void main(String[] args) {
		
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 1 
//		2 3 4 5 6 

		
		int n=5;
		int k=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(k+ " ");
				k++;
				if(k==10)
				{
					k=1;
				}
			}
			System.out.println();

		}
		

	}

}
