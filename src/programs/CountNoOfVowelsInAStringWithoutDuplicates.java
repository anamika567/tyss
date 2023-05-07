package programs;

import java.util.LinkedHashSet;

public class CountNoOfVowelsInAStringWithoutDuplicates {

	public static void main(String[] args) {
		
		String s="testyantra"; // o/p : ea=2
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		int count=0;
		for(Character ch : set)
		{
			if(ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'||
					ch=='o'|| ch=='O'||ch=='u'||ch=='U')
			{
				count++;
				System.out.println(ch);
			}
		}
		
		System.out.println("The no. of vowels in a string are:"+count);
	}

}
