package ArrayPrograms;

public class ZigzagArray {

	public static void main(String[] args) {

		int a[]= {12,23,34,51,42,36};
		int b[]= {56,13,14,18,28,29};
		int res[]=new int[a.length+b.length];
		int i=0;
		int j=0;
		for(int k=0;k<res.length;)
		{
			if(i<a.length)
			{
				res[k]=a[i];
				i++;
				k++;
			}
			
			if(j<b.length)
			{
				res[k]=b[j];
				j++;
				k++;
			}
			
		}
		System.out.println("Zigzag array:");
		for(int l=0;l<res.length;l++)
		{
			System.out.print(res[l]+" ");
		}	
	}

}
