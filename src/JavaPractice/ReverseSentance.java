package JavaPractice;

public class ReverseSentance {

	public static void main(String[] args) {

		String s="welcome to bangalore city";
		String st[]=s.split(" ");
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}
	}

}
