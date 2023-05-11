package assignment;

public class Anamika {

	public static void main(String[] args) {

		CharSequence ch="anamikasingh"; // aaiaig=8
		int a = ch.length();
		String temp ="";
		int count=2;
		for(int i=0;i<a;i++)
		{
			if(i%2==0)
			{
				count++;
				temp=temp+ch.charAt(i);
			}
		}
		System.out.println(temp+"="+count);
		
		
		
		
	}

}
