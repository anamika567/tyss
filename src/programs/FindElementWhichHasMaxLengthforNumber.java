package programs;

public class FindElementWhichHasMaxLengthforNumber {

	public static void main(String[] args) {

		String a[]= {"123","8656","41512626","1256"};
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
