package sdet_java_programs;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {

		String s="java   programming  selenium   automation";
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}

}
