package sdet_java_programs;

public class ReverseEachwordInString {

	public static void main(String[] args) {

		//logic 1:
		
//		String s="welcome to india";
//		String word[]=s.split(" ");
//		String reverseString="";
//		
//		for(String w:word)
//		{
//			String reverseWord="";
//			for(int i=w.length()-1;i>=0;i--)
//			{
//				reverseWord=reverseWord+w.charAt(i);
//			}
//			
//			reverseString=reverseString+reverseWord+" ";	
//		}
//		
//		System.out.println(reverseString);
		
		// logic 2:
		
		String str="welcome to india";
		String word[]=str.split("\\s");
		String reverseWord="";
		for(String w:word)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseWord=reverseWord+sb.toString()+" ";
			
		}
		System.out.println(reverseWord);
		
	}

}
