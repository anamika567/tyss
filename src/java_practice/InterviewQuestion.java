package java_practice;

import java.util.LinkedList;

public class InterviewQuestion {

	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//list.add(60);
		
		int count=list.size();
		
		if(count%2==0)
		{
		for(int i=(count/2)-1;i<=count/2;i++)
		{
			System.out.println(list.get(i));
		}
		}
		
		else
		{
			for(int i=count/2;i<=count/2;i++)
			{
				System.out.println(list.get(i));
			}
		}

}
}

