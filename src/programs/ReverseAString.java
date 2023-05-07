package programs;

public class ReverseAString {

	public static void main(String[] args) {
		
		String s="Testyantra"; // o/p: artnaytseT
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	
		
		/* 2.
		String s="Testyantra";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		*/
		
		/* 3.
		String s="Testyantra";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
      */
		
		/* 4.
		String s="Testyantra";
		char ch[]=s.toCharArray();
		int count=0;
		for(char c : ch)
		{
			count++;
		}

		for(int i=count-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		*/
		/* 5.
		StringBuilder s=new StringBuilder("Testyantra");
		System.out.print(s.reverse());
		
		*/
		/* 6.
		StringBuffer sb=new StringBuffer("Testyantra");
		System.out.print(sb.reverse());
		*/
	}

}
