package String;

public class StringManipulation {

	public static void main(String[] args) {

		String s1="Java";
		//s1="Wave";
		System.out.println("s1 is: " +s1);
		
		String s2="Java";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("Java");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
