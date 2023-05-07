package programs;

public class SegregateTheAlphabateDigitsSpecialCharactersInString {

	public static void main(String[] args) {
		
		String s="vahb@1$bj545"; // o/p :  vhbbj 1545 @$

		String alpha=" ";
		String digit=" ";
		String spc=" ";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				digit=digit+s.charAt(i);
			}
			else
			{
				spc=spc+s.charAt(i);
			}
		}

		System.out.print(alpha+digit+spc);
	}

}
