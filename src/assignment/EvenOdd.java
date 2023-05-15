package assignment;

public class EvenOdd {

	public static void main(String[] args) {
		
		int a[]= {3,2,4,8,5,1,7,6,9};
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
