package StringDurgaSoft;

public class StringPracticeQuestion2 {

	public static void main(String[] args) {

		String s1="durga"; // created in scp
		String s2=s1.toString(); // bcz of toString() operation no change then current object will be used
		String s3=s1.toLowerCase();
		String s4=s1.toUpperCase();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
	}

}
