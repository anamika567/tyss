package StringDurgaSoft;

public class StringPracticeQuestion9 {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("Durga");
		sb.delete(0, sb.length()); 
		System.out.println(sb.length());
	}

}
