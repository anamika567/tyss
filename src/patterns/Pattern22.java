package patterns;

public class Pattern22 {

//	1     
//	2 3    
//	4 5 1   
//	2 3 4 5  
//	1 2 3 4 5 

	public static void main(String[] args) {

		int n=5;
		int k=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print((k++%5)+1 +" ");
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
