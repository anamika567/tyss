package StringDurgaSoft;

public class StringConstructer1 {

	public static void main(String[] args) {

		char ch[]= {'j','a','v','a'};
		String s=new String(ch);
		System.out.println(s);
		
		byte b[]= {97,98,99,100};
		String s1=new String(b);
		System.out.println(s1);
	}

}
