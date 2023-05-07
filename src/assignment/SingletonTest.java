package assignment;

public class SingletonTest {
	
	private static SingletonTest instance=null;
	private SingletonTest()
	{
		System.out.println("object created");
		System.out.println("hello");
	}

	public static SingletonTest getInstanceOfClass() {
		if(instance==null)
			instance =new SingletonTest();
		return instance;
	}
}

