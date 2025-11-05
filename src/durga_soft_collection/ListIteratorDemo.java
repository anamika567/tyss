package durga_soft_collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList l=new LinkedList<>();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			
			if(s.equals("venki"))
			{
				ltr.remove();
			}
			else if(s.equals("nag"))
			{
				ltr.add("chiatu");
			}
			else if(s.equals("chiru"))
			{
				ltr.add("charan");
			}
		}
		System.out.println(l);
	}

}
