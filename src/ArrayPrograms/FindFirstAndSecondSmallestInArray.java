package ArrayPrograms;

public class FindFirstAndSecondSmallestInArray {

	public static void main(String[] args) {

		int ar[]= {12,2,25,35,0,5};
		int fsmall=ar[0];
		int ssmall=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(fsmall>ar[i])
			{
				ssmall=fsmall;
				fsmall=ar[i];
			}
			else if(ssmall>ar[i])
			{
				ssmall=ar[i];
			}
		}
		System.out.println("First smallest is: "+fsmall);
		System.out.println("Second smallest is: "+ssmall);
		
	}

}
