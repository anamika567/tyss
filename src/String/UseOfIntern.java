package String;

public class UseOfIntern {

	public static void main(String[] args) {

		String s1="code";
		
		String s2=new String("code");
		
		String s3=s2.intern();
		
		System.out.println(s3==s1);
		System.out.println(s3==s2);
		
	}

}
