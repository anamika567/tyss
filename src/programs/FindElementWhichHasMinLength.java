package programs;

public class FindElementWhichHasMinLength {

	public static void main(String[] args) {
		
		String a[]= {"asd","db","qddqwdq","ab","abcefg"};
		String minLen=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			
			if(minLen.length()>a[i].length())
			{		
				minLen=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(minLen.length()==a[i].length())
			{
				minLen=a[i];
				System.out.println(a[i]);

			}
		}
	}
}
