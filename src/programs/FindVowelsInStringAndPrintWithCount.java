package programs;

import java.util.LinkedHashSet;

public class FindVowelsInStringAndPrintWithCount {

	public static void main(String[] args) {

			String a="anamika";
			String vow="AEIOUaeiou";
			String s=a.toLowerCase();
			LinkedHashSet<Character> set=new LinkedHashSet<>();
			for(int i=0;i<s.length();i++)
			{
				set.add(s.charAt(i));
			}
			
			for(Character it:set)
			{
				int count=0;
				for(int i=0;i<s.length();i++) 
				{
					if(it==s.charAt(i) && vow.indexOf(s.charAt(i))!=-1 )
					{	
					  count++;
					}
				}
				if(count>=1) 
				{
				 System.out.println(it+" is "+count);
				}
			}
		
		
	}

}
