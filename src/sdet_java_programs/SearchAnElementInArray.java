package sdet_java_programs;

public class SearchAnElementInArray {

	public static void main(String[] args) {

		int a[]= {20,10,30,54,40};
		int search=5;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("Element is found:"+i);
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element is not found");
		}
	}

}
