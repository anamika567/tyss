package patterns;

public class Pattern7 {

	public static void main(String[] args) {
		
//		A 
//		B C 
//		D E F 
//		G H I J 
//		K L M N O 

		
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}

	}

}
