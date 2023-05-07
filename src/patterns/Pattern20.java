package patterns;

public class Pattern20 {

//	0     
//	1 2    
//	3 4 5   
//	6 7 8 9  
//	0 1 2 3 4 

	public static void main(String[] args) {

		int n=5;
		int k=10;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(k++%10 +" ");
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
