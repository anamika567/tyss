package programs;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		
		int[] a= {1,5,6,8,4};
		int[] b= {4,9,7,6};
		int length=a.length; // 5
		if(a.length<b.length) // 5<4f
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
			// i=0 0<5t
			// i=1 1<5t
			// i=2 2<5t
			// i=3 3<5t
			// i=4 4<5t
		{
			try 
			{
			  System.out.print(a[i]+b[i]+" ");//1+4=5 5+9=14 6+7=13 8+6=14 4+arrayIndexOutOfBounds
				
			} 
			catch (Exception e) {
				
				if(a.length<b.length)
				{
					System.out.print(b[i]);
				}
				else
				{
					System.out.print(a[i]);
				}
			}
		}
		
	}

}
