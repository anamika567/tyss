package StringDurgaSoft;

public class StringStringBuffer2 {

	public static void main(String[] args) {

		// Difference between == and eqauals
		
		String s1=new String("durga");
		String s2=new String("durga");
		System.out.println(s1==s2); // false (Compare reference)
		System.out.println(s1.equals(s2)); // true  (Compare content because equals overridden in String class)
		
		StringBuffer sb1=new StringBuffer("durga");
		StringBuffer sb2=new StringBuffer("durga");
		System.out.println(sb1==sb2);  // false (Compare reference)
		System.out.println(sb1.equals(sb2));  // false  (Compare reference because doen not overridden in StringBuffer Class Object class equals() will be executed)
		
	}

}
