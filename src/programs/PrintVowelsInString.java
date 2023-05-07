package programs;

public class PrintVowelsInString {

	public static void main(String[] args) {
		
		String s="testyantra"; // o/p: eaa3
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='A'|| ch[i]=='e'|| ch[i]=='E'|| ch[i]=='i'|| 
					ch[i]=='I'|| ch[i]=='o'|| ch[i]=='O'||ch[i]=='u'||ch[i]=='U')
			{
				count++;
				System.out.print(ch[i]);
			}
		}
		System.out.println(count);

	}

}
