package patterns;

public class Pattern21 {
	
//	1     
//	2 3    
//	4 5 6   
//	7 8 9 1  
//	2 3 4 5 6 


	public static void main(String[] args) {

		int n=5;
		int k=9;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print((k++%9)+1 +" ");
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
