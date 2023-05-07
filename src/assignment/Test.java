package assignment;

public class Test {

	public static void main(String[] args) {
		
		String s="Hello"; //ELLO
		char a[]=s.toCharArray();
		for(int i=1;i<a.length;i++)
		{
			System.out.print((char)(a[i]-32));
		}
	
//		
//		String s="Hello"; //ELLO
//		String temp="";
//		for(int i=1;i<s.length();i++)
//		{
//			char c=(char)(s.charAt(i)-32);
//			temp=temp+c;
//		}
//		System.out.println(temp);
//	

	}

}
