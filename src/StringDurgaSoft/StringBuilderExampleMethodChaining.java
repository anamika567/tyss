package StringDurgaSoft;

public class StringBuilderExampleMethodChaining {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder();
		sb.append("durga").append("Soft").reverse().insert(2, "XYZ").delete(3, 7);
		System.out.println(sb);
	}

}
