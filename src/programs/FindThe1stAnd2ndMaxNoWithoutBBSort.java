package programs;

public class FindThe1stAnd2ndMaxNoWithoutBBSort {

	public static void main(String[] args) {
		
		int a[]= {9,2,5,3,4,11,25};
		int fmax=a[0]; //9 9
		int smax=a[0]; //9 2 5
		
		for(int i=1;i<a.length;i++)
		{
			// 0 0<5t 
			// 1 1<5t 
			// 2 2<5t 
			// 3 3<5t
			// 4 4<5t
			if(fmax<=a[i]) // 9<=4 f
			{
				if(a[i]!=fmax) //9!=9 f
				{	
				smax=fmax;
				}
				fmax=a[i];//9	
			}
			else if(fmax==smax||a[i]>smax)//9==5 4>=5 f
			{
				smax=a[i]; //2 5
			}
			
		}
		System.out.println("first max is ="+fmax);//9
		System.out.println("Second max is ="+smax);//5




	}

}
