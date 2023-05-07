package assignment;

public class ReverseString {

	public static void main(String[] args) {

		String s="My name is anamika"; // anamika is name My 
		String st[]=s.split(" ");
		String rev="";
		for(int i=st.length-1;i>=0;i--)
		{
			rev=rev+st[i]+" ";
		}
		System.out.print(rev);
	}

}
