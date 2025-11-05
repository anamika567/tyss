package JavaPractice;

public class SwapTheFirstAndLastWord {

	public static void main(String[] args) {

		String s="Welcome to the bangalore city";
		String st[]=s.split(" ");
		
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}
	}

}
