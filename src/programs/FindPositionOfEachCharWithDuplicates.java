package programs;

import java.util.HashSet;

public class FindPositionOfEachCharWithDuplicates {

	public static void main(String[] args) {
		
		String a="TestYantra";
		char c[]=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" is in "+(i+1)+" position");	
		}
	}

}
