package sdet_java_programs;

import java.util.LinkedHashSet;

public class FindVowelsInStringPrintCountAlso {

	public static void main(String[] args) {

		String a="anamika";
		char ch[]=a.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		
		for(Character it:set)
		{
			int count=0;
			for(int i=0;i<ch.length;i++) 
			{
				if(it==ch[i])
				{
					if(ch[i]=='a'|| ch[i]=='A'|| ch[i]=='e'|| ch[i]=='E'|| ch[i]=='i'|| ch[i]=='I'||
							ch[i]=='o'|| ch[i]=='O'||ch[i]=='u'||ch[i]=='U')
					{
					count++;
					}
				}
			}
			if(count>=1) 
			{
			 System.out.println(it+" is "+count);
			}
		}

	}

}
