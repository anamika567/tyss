package patterns;

public class Pattern18 {

//	a     
//	a b    
//	a b c   
//	a b c d  
//	a b c d e 

	public static void main(String[] args) {

		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print((char)('a'+j) +" ");
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
