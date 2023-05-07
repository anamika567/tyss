package assignment;

public class Question {

	public static void main(String[] args) {

		int ar[]= {2,1,-5,-1,-3,-2,-6,7};
		int temp=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
		}
		System.out.println(ar[0]*ar[1]*ar[2]);
	}

}
