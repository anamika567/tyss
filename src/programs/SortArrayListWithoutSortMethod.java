package programs;

import java.util.ArrayList;

public class SortArrayListWithoutSortMethod {

	public static void main(String[] args) {

		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(15);
		l.add(8);
		l.add(10);
		l.add(20);
		l.add(5);
		
		for(int i=0;i<l.size();i++)
		{
			for(int j=l.size()-1;j>i;j--)
			{
				if(l.get(i)>l.get(j))
				{
					int temp=l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
					
				}
	        }
		}
		for(Integer i:l)
		{
			System.out.println(i);
		}
	}

}
