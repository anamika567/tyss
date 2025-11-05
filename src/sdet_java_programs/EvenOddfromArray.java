package sdet_java_programs;

public class EvenOddfromArray {

	public static void main(String[] args) {

		int a[]= {12,15,16,34,51,21};

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
		System.out.println("Even no: "+even);
		System.out.println("Odd no: "+odd);
	}

}
