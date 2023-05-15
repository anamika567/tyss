package assignment;

public class Test {

	public static void main(String[] args) {
		
		String s="Hello"; //ELLO
		char a[]=s.toCharArray();
		for(int i=1;i<a.length;i++)
		{
			System.out.print((char)(a[i]-32));
		}
	

	}

}
