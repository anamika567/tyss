package patterns;

public class Pattern26 {

//	0     
//	1 1    
//	0 0 0   
//	1 1 1 1  
//	0 0 0 0 0 

	public static void main(String[] args) {

       int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(i%2 +" ");
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
