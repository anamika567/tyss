package durga_soft_collection;

import java.util.Comparator;
import java.util.TreeSet;

 public class Employeee implements Comparable<Object>{
	
	String name;
	int eid;
	Employeee(String name ,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	
	public String toString()
	{
		return name+"--"+eid;
	}

	public int compareTo(Object obj)
	{
		int eid1=this.eid;
		Employeee e=(Employeee)obj;
		int eid2=e.eid;
		if(eid1<eid2)
		{
			return -1;
		}
		
		else if(eid1>eid2)
		{
			return 1;
		}
		
		else
			return 0;
		
	}
}	
	class Compcomp{
	public static void main(String[] args) {

		Employeee e1=new Employeee("nag", 100);
		Employeee e2=new Employeee("balaiah", 200);
		Employeee e3=new Employeee("chiru",50);
		Employeee e4=new Employeee("venki",150);
		Employeee e5=new Employeee("nag",100);
		
		TreeSet<Object> t=new TreeSet<Object>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		

		TreeSet<Object> t1=new TreeSet<Object>(new MynewComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
			
	}

}

	class MynewComparator implements Comparator<Object>
	{
		public int compare(Object obj1,Object obj2)
		{
		Employeee e1=(Employeee)obj1;
		Employeee e2=(Employeee)obj2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
	}