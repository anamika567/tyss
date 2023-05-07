package programs;

public class FindElementWhichHasMinLengthForNumbers {

	public static void main(String[] args) {

		String a[]= {"123","8656","41512626","1256"};
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

