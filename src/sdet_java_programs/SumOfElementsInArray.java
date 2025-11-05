package sdet_java_programs;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		// logic 1: using for loop
		int a[]= {1,2,4,5,3,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		// logic 2: using foreach loop
//		for(Integer i:a)
//		{
//			sum=sum+i;
//		}
//		
		System.out.println(sum);

	}

}
