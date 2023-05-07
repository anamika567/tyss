package programs;

public class FindThePositionOfEachNosInAnArray {

	public static void main(String[] args) {
		
		int[] a= {2,3,1,2,3,5};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" is in "+(i+1)+" position");
		}

	}

}
