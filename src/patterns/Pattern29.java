package patterns;

public class Pattern29 {

//	5      
//	4 4     
//	3 3 3    
//	2 2 2 2   
//	1 1 1 1 1  

	public static void main(String[] args) {

		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i>=j)
				{
					System.out.print(n-i +" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
