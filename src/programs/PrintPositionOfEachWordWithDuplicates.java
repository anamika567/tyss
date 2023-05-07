package programs;

import java.util.HashSet;

public class PrintPositionOfEachWordWithDuplicates {

	public static void main(String[] args) {
		
		String str="I am from from am Testyantra";
		String st[]=str.split(" ");
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]+" is in "+(i+1)+" position");

		}

	}

}
