package patterns;

public class Pattern16 {
	
//	a     
//	b c    
//	d e f   
//	g h i j  
//	k l m n o 


	public static void main(String[] args) {
		
		int n=5;
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(ch++ +" ");
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
