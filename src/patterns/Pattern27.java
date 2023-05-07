package patterns;

public class Pattern27 {

//	1     
//	1 0    
//	1 0 1   
//	1 0 1 0  
//	1 0 1 0 1 

	public static void main(String[] args) {

		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
				System.out.print((j+1)%2 +" ");
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
