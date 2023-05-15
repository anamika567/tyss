package assignment;

import java.util.HashMap;

public class InterviewQuestion3 {

	public static void main(String[] args) {

		String st="helloo";
		
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		for(int i=st.length()-1;i>=0;i--)
		{
			if(hs.containsKey(st.charAt(i)))
			{
				int count=hs.get(st.charAt(i));
				hs.put(st.charAt(i), ++count);
			}
			else
			{
				hs.put(st.charAt(i), 1);
			}
		}
		System.out.println(hs);
	}

}
