package String;

public class StringFunctionDemo {

	public static void main(String[] args) {

	// concatenation
		
		String firstname="Anamika";
		String lastname="Singh";
		String Fullname=firstname+"@"+lastname;
		String fullname=firstname.concat(lastname);
		System.out.println(fullname);
		System.out.println(Fullname);

		
	// length()
		
		System.out.println(fullname.length());

	// charAt()
		
		for(int i=0;i<fullname.length();i++)
		{
			System.out.println(fullname.charAt(i));
		}
		
	// substring(beg index, end index)
		
		String sentance="My name is Anamika";
		String name=sentance.substring(11, sentance.length());
		System.out.println(name);
		
		String s="TonyStark";
		String fname=s.substring(0, 4);
		System.out.println(fname);
		
		String n="TonyStark";
		String lname=s.substring(4);
		System.out.println(lname);
		
		
		
	}

}
