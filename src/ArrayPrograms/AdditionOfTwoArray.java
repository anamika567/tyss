package ArrayPrograms;

public class AdditionOfTwoArray {

	public static void main(String[] args) {

		int a[]= {2,5,6,4,21};
		int b[]= {12,2,6,5};
		
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		
		for(int i=0;i<length;i++)
		{
			try {
				System.out.print(a[i]+b[i]+" ");
				
			} catch (Exception e) {
				
				if(a.length<b.length)
				{
					System.out.print(b[i]);
				}
				else
				{
					System.out.print(a[i]);
				}
			}
		}
		
	}

}
