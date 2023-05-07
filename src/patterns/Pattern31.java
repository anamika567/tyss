package patterns;

public class Pattern31 {

//    5 
//   4 5 
//  3 4 5 
// 2 3 4 5 
//1 2 3 4 5 

	public static void main(String[] args) {

		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=n-1)
				{
					System.out.print(j+1 +" ");
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
