package ArrayPrograms;

public class SegregateEvenOddNoFromArray {

	public static void main(String[] args) {

		int a[]= {2,4,5,3,1,8,9,7};
		String even="";
		String odd="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even=even+a[i]+" ";
			}
			else
			{
				odd=odd+a[i]+" ";
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
	}

}
