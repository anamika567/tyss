package ArrayPrograms;

public class FindFirstSmallAndSecondSmallInArray {

	public static void main(String[] args) {

		int ar[]= {12,23,25,35,0,5};
		int fsmall=ar[0];
		int ssmall=ar[1];
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
