package assignment;

public class InterviewQuestion1 {

//	a 
//	a e 
//	a e i 
//	a e i o 
//	a e i o u 

	public static void main(String[] args) {

		int row=5;
		int col=1;
		
		String s="aeiou";
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
			col++;
		}
				
			}
			 
	  }
		
		
	


