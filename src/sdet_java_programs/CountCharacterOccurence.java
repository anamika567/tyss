package sdet_java_programs;

public class CountCharacterOccurence {

	public static void main(String[] args) {

		String s="java is a programming language";
		
		// logic 1:
		char c='a';
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				count++;
			}
		}
		System.out.println("a occurence is: "+count);
		
		//logic 2:
//		int totalLen=s.length();
//		int afterRemovea = s.replaceAll("a", "").length();
//		int count=totalLen-afterRemovea;
//		System.out.println("a occurence is:"+count);
	}

}
