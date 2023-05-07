package ArrayPrograms;

public class SearchElementInArray {

	public static int search(int br[],int ele)
	{
		for(int i=0;i<br.length;i++)
		{
			if(ele==br[i])
				return i;
				
		}
		return -1;
	}
	public static void main(String[] args) {

		int ar[]= {12,23,52,41,63};
		int inx=search(ar,52);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		if(inx>=0)
			System.out.println("Your element is found at index: "+inx);
		else
			System.out.println("Not valid");
		
	}

}
