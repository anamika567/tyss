package assignment;

public class InterviewQuestion4 {

	public static void main(String[] args) {

		String str="anamika"; // akimana aiaa
		char[] ch=new char[str.length()];
		String s=""; 
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));

			if(i%2==0)
			{
				s=s+str.charAt(i);
			}
		
		}

		System.out.print("   -> "+s);
	}
	

}
