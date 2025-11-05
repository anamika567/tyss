package JavaPractice;

import java.util.ArrayList;

public class SortArrayListWithoutSortMethod {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(25);
		list.add(5);
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=list.size()-1;j>i;j--)
			{
				if(list.get(i)>list.get(j))
				{
				int temp=list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
				}
			}
		}
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
	}

}
