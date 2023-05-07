package programs;

public class CountVowelAndConsonantInString {

	public static void main(String[] args) {
		
		String s="mysore";
		char ch[]=s.toCharArray();
		int vc=0;
		int cc=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='A'|| ch[i]=='e'|| ch[i]=='E'|| ch[i]=='i'|| 
					ch[i]=='I'|| ch[i]=='o'|| ch[i]=='O'||ch[i]=='u'||ch[i]=='U')
			{
				vc++;
			}
			else {
				cc++;
			}
			
		}
		System.out.println("vowel=" +vc);
		System.out.println("Consonant=" +cc);
	}

}
