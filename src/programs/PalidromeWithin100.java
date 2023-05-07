package programs;

public class PalidromeWithin100 {

	public static boolean getPalindrome(int x)
	{
		int temp=x;
		int rev=0;
		do {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
			
		}while(x!=0);
		
		return rev==temp;
			
	}
	public static void main(String[] args) {
		
		int n=100;
		for(int i=1;i<=n;i++)
		{
			boolean rs=getPalindrome(i);
			if(rs==true)
			{
				System.out.print(i+" ");
			}
		}

	}

}

