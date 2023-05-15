package assignment;

public class FirstAndLastWordCapitalInSentence {

	public static void main(String[] args) {
		
		String s="This is a Sentance"; // o/p: THIS is  a SENTANCE
		String a=s.toLowerCase();
		String n[]=a.split(" ");
		for(int i=0;i<n.length;i++)
		{
			String st=n[i];
			if(i==0 || i==n.length-1) 
			{
				for(int j=0;j<st.length();j++)
				{
					char ch=(char)(st.charAt(j)-32);
					System.out.print(ch);
				}
			}
			else
			{
			  System.out.print(" "+st+" ");
			}
		}

	}

}
