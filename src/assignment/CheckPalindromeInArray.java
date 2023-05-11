package assignment;

public class CheckPalindromeInArray {

	public static void main(String[] args) {
		
		int a[]= {22,36,57,66,98,121};
		
		for(int i=0;i<a.length;i++)
		{
			int x=a[i];
			int rev=0;
			while (x!=0) 
			{
				int d=x%10;
				rev=rev*10+d;
				x=x/10;
		    }
			
			if(rev==a[i])
			{
				System.out.println(a[i]+" palindrome");
			}
			else
			{
				System.out.println(a[i]+" Not palindrome");
			}
		}
		
	}

}
