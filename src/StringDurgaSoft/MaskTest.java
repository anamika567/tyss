package StringDurgaSoft;

public class MaskTest {

	public static String mask(String creditCard)
	{
		String x="xxxx-xxxx-xxxx-";
		
		//return x+creditCard.substring(15, 19);
		
		//or
		StringBuilder sb=new StringBuilder(x);
		sb.append(creditCard,15,19);
		return sb.toString();
		
	}
	public static void main(String[] args) {

		System.out.println(mask("1234-5678-9101-5979"));
	}

}
