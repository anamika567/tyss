package patterns;

public class Pattern17 {
	
//	a     
//	b b    
//	c c c   
//	d d d d  
//	e e e e e 


	public static void main(String[] args) {

		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print((char)('a'+i) +" ");
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
