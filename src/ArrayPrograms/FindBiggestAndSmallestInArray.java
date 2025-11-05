package ArrayPrograms;

public class FindBiggestAndSmallestInArray {

	public static void main(String[] args) {

		int ar[]= {12,32,26,24,31,65,45};
	    int bigger=ar[0];
	    int smaller=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(bigger<ar[i])
			{
				bigger=ar[i];
			}
			else if(smaller>ar[i])
			{
				smaller=ar[i];
			}
		}
		System.out.println("Biggest element is: "+bigger);
		System.out.println("Smallest element is: "+smaller);
		
	}

}
