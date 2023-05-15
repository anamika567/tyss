package assignment;

import java.util.Scanner;

public class primecheck {

	public static void main(String[] args) {

		          Scanner sc=new Scanner(System.in);
		          System.out.println(" enter x value:");
		           int x=sc.nextInt();
		           
		           //int x=19;
		           
		           boolean flag=true;
		          
		           for(int j=2;j<=x/2;j++)
		           {
		               if(x%j==0)
		               {
		                   flag=false;
		               }
		           }
		           if(flag==true)
		           {
		               System.out.println(x+"prime");
		           }
		           else
		           {
		               System.out.println(x+"Not prime");
		           }
		      
	}

}
