package programs;

public class AppendEvenNoAtTheFirst {

	public static void main(String[] args) {

		 int a[]={10,20,21,40,60,15,17};
	        int b[]=new int[a.length];
	        int m=0;
	        int n=a.length-1;
	        for(int i=0;i<a.length;i++)
	        {
	            if(a[i]%2==0)
	            {
	                b[m]=a[i];
	                m++;
	            }
	            else
	            {
	                b[n]=a[i];
	                n--;
	            }
	        }
	        for(int i=0;i<b.length;i++)
	        {
	            System.out.print(b[i]+" ");
	        }
	}

}
