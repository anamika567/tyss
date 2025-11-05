package java_practice;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str="hello welcome to india";
		String rev="";
		String st[]=str.split(" ");
		for(String word:st)
		{
			char ar[]=word.toCharArray();
			for(int i=ar.length-1;i>=0;i--)
			{
				rev=rev+ar[i];
				
			}
			rev=rev.toString()+" ";
		}
		System.out.println(rev.trim());

		
	}

}
