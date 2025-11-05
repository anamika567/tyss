package durga_soft_collection;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {

		Hashtable h=new Hashtable<>();
		// eg.3
		//Hashtable h=new Hashtable<>(25);

		
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		//h.put("durga",null); // NPE
		System.out.println(h);
	}

}

class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	
	public int hashCode()
	{
		return i;
		//eg.2 
		//return i%9;
	}
	
	public String toString()
	{
		return i+"";
	}
}