package patterns;

public class Pattern28 {
	
//	5     
//	5 4    
//	5 4 3   
//	5 4 3 2  
//	5 4 3 2 1 


	public static void main(String[] args) {

		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(n-j +" ");
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
