package ArrayPrograms;

public class DisplayCommonElementInArray {

	public static void main(String[] args) {

		int a[]= {12,15,45,35,62,51};
		int b[]= {32,35,62,51,45,13,10};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

}
