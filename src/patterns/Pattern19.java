package patterns;

public class Pattern19 {
	
//	a     
//	b c    
//	c d e   
//	d e f g  
//	e f g h i 


	public static void main(String[] args) {

		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print((char)('a'+i+j) +" ");
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
