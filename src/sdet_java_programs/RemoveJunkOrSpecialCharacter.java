package sdet_java_programs;

public class RemoveJunkOrSpecialCharacter {

	public static void main(String[] args) {

		String s="$%&&SVkdvm545485400d#$%$%^";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
