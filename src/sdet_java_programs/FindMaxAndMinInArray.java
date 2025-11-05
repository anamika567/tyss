package sdet_java_programs;

public class FindMaxAndMinInArray {

	public static void main(String[] args) {

		int a[]= {21,56,45,78,99,32,12};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		System.out.println("Max is:"+max);
		System.out.println("Min is:"+min);
	}

}
