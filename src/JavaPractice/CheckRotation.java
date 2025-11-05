package JavaPractice;

public class CheckRotation {

	public static void main(String[] args) {

		String s1="HELLO";
		String s2="LOHEL";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("s2 not rotated version of s1");
		}
		
		else
		{
			String s3=s1+s1;
			if(s3.contains(s2))
			{
				System.out.println("s2 is roatated version");
			}
			
			else
			{
				System.out.println("s2 is not rotated version");
			}
			
		}
	}
	

}
