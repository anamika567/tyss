package programs;

public class SeperateEvenOdd {

	public static void main(String[] args) {

		int a[]= {44,45,89,74,71,31,32};
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
