package StringDurgaSoft;

public class StringStringBuffer {

	public static void main(String[] args) {

		// Difference between String and StringBuffer
		// String is immutable/unchangable.
		// String is mutable/changeable
		
		String s=new String("durga");
		s.concat("software");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("durga");
		sb.append("software");
		System.out.println(sb);
	}

}
