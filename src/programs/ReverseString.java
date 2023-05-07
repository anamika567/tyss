package programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Welcome to Bengaluru city"; // o/p: city Bengaluru to Welcome 
		String st[]=s.split(" ");
		String rev="";
		for(int i=st.length-1;i>=0;i--)
		{
			rev=rev+st[i]+" ";
		}
		System.out.println(rev);
		
		
	}

}
