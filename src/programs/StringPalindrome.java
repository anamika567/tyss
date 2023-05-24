package programs;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(rev.equals(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		

		/*
		String s="malayalam";
		char ch[]=s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		
		if(rev.equals(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		*/
		
	}

}
