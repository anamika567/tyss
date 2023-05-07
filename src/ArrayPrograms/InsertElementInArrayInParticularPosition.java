package ArrayPrograms;

public class InsertElementInArrayInParticularPosition {

	public static int[] insertArr(int ar[],int ele,int index)
	{
		if(index<0 || index>ar.length)
		{
		  System.out.println("Index not in range");
		  return ar;
		}
		
		int br[]=new int[ar.length+1];
		for(int i=0;i<ar.length;i++)
		{
			if(i<index)
			   br[i]=ar[i];
			
			else
			  br[i+1]=ar[i];
			
		}
		
		br[index]=ele;
		return br;
		
	}
	public static void main(String[] args) {

		int a[]= {21,24,11,16};
		a=insertArr(a,72,3);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
