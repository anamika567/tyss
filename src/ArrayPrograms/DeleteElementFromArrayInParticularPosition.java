package ArrayPrograms;

public class DeleteElementFromArrayInParticularPosition {

	public static int[] deleteArr(int ar[],int index)
	{
		if(index<0 ||index>ar.length)
		{
			return ar;
		}
		
		int br[]=new int[ar.length-1];
		for(int i=0;i<br.length;i++)
		{
			if(i<index)
				br[i]=ar[i];
			
			else
				br[i]=ar[i+1];
		}
		return br;
	}
	public static void main(String[] args) {

		int a[]= {12,25,24,23,35};
		a=deleteArr(a,2);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
				
	}

}
