package programs;

public class SwapTheFirstAndLastWordInTheString {

	public static void main(String[] args) {
		
		String s="Welcome to Bengaluru city"; // o/p : city to Bengaluru Welcome 
		//int temp=a;
		//a=b;
		//b=temp
		
		String st[]=s.split(" ");
		//st[0]=Welcome
		//st[1]=to
		//st[2]=Bengaluru
		//st[3] or st[st.length-1]=city 
		
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}

	}

}
