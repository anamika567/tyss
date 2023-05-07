package programs;

public class ReveseTheGivenStringByWord {

	public static void main(String[] args) {
		
		String s="Welcome to Bengaluru city"; // o/p:  city Bengaluru to Welcome 
		String[] st=s.split(" ");
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}

	}

}
