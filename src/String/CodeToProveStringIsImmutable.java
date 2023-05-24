package String;

public class CodeToProveStringIsImmutable {

	public static void main(String[] args) {

		String s1="code";
		System.out.println(s1.hashCode());
		
		s1=s1+"java"; // it will create another object in scp
		System.out.println(s1.hashCode());
		
	}

}
