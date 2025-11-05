package java_practice;

public class CheckStatic {

	static String name="Anamika";
	
	public static void main(String[] args) {

		System.out.println(name);
		//CheckStatic vh=new CheckStatic();
		//vh.getName();
		getName();
		
	}
	public static void getName()
	{
		//System.out.println(name);
		name="singh";
		System.out.println(name);
	}

}
