package StringDurgaSoft;

class MyString{
	
	String msg;
	
	MyString(String msg){
		this.msg=msg;
		
	}
	
//	public String toString()
//	{
//		return msg;
//	}
}
public class Test2 {

	public static void main(String[] args) {

		System.out.println("Hello" +new StringBuilder("Java SE 8")); // In StringBuilder toString() is overridden.
		System.out.println("Hello" +new MyString("Java SE 8") ); // In MyString we have not written toString().
	}

}
