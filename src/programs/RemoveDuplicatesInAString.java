package programs;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInAString {

	public static void main(String[] args) {
		
		String s="deep";
        char ch[]=s.toCharArray();
        LinkedHashSet<Character> set=new LinkedHashSet<Character>();
        for(int i=0;i<ch.length;i++)
        {
            set.add(ch[i]);
        }
        
        for(Character it:set)
        {
        	System.out.println(it);
        }
	}

}
