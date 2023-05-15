package assignment;

public class ReverseTheNumber {

	public static void main(String[] args) {

		int x=4546215;
		int rev=0;
		while(x!=0)
		{
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}
		System.out.println(rev);
	}

}
