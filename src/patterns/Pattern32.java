package patterns;

public class Pattern32 {

//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5 

	public static void main(String[] args) {

       int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=n-1)
				{
					System.out.print(i+1 +" ");
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
