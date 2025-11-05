package durga_soft_collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

	TreeSet t=new TreeSet(new MyyComparator()); 

		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("Gangabhawani");
		t.add("Ramulamma");
		System.out.println(t);
	}

}

class MyyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
		//return -s1.compareTo(s2);

	}
}

