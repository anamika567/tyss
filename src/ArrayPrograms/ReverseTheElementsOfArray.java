package ArrayPrograms;

public class ReverseTheElementsOfArray {

	public static void main(String[] args) {

		int ar[]= {12,23,45,63,52,42};
		
		for(int i=0;i<ar.length/2;i++)
		{
			int temp=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=temp;
		}
		System.out.println("After Reverse");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
