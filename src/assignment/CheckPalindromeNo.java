package assignment;

public class CheckPalindromeNo {

	public static void main(String[] args) {

		int x=151;
		int temp=x;
		int rev=0;
		while(x!=0)
		{
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
			
		}
		if(rev==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
