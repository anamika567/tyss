package programs;

public class FindElementWhichHasMaxLengthForAlphabate {

	public static void main(String[] args) {
		
		String a[]= {"asd","db","qddqwdq","ab","abcefg"};
		String maxLen=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			
			if(maxLen.length()<a[i].length())
			{		
				maxLen=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(maxLen.length()==a[i].length())
			{
				maxLen=a[i];
				System.out.println(a[i]);

			}
		}


	}

}
