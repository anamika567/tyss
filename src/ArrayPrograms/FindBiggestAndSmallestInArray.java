package ArrayPrograms;

public class FindBiggestAndSmallestInArray {

	public static void main(String[] args) {

		int ar[]= {12,32,26,24,31};
	    int bigger=0;
	    int smaller=0;
		for(int i=0;i<ar.length;i++)
		{
			int big=ar[0];
			int small=ar[0];
			
			if(big<ar[i])
			{
				big=ar[i];
			}
			else if(small>ar[i])
			{
				small=ar[i];
			}
			smaller=small;
			bigger=big;
		}
		System.out.println("Biggest element is: "+bigger);
		System.out.println("Smallest element is: "+smaller);
		
	}

}
