package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueCharacterInString {

	public static void main(String[] args) {
		
		String s="TestYantra"; // o/p: tesyanr
		String st=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();

		for(int i=0;i<st.length();i++)
		{
			set.add(st.charAt(i));

		}
		
		for(Character c :set)
		{
			System.out.print(c);
		}
		
	}
}  
