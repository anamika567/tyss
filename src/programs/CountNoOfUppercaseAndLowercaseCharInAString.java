package programs;

public class CountNoOfUppercaseAndLowercaseCharInAString {

	public static void main(String[] args) {
		
		String s="TesTYaNtRa";
		int uppercase=0;
		int lowercase=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				uppercase++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lowercase++;
			}
		}
		System.out.println(uppercase);
		System.out.println(lowercase);
		

	}

}
