package StringDurgaSoft;

public class StringExample {

	public static void main(String[] args) {

		String s1=new String("durga"); // created in heap and scp both
		String s2=s1.toUpperCase(); // runtime operation is  performed so object is created in heap area
		String s3=s1.toLowerCase();
		
		System.out.println(s1==s2); // false
		System.out.println(s1==s3); // true
		
	}

}
