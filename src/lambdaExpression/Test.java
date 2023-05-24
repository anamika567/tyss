package lambdaExpression;

@FunctionalInterface
interface  Cab
{
	public void bookCab();
}

//class Ola implements Cab
//{
//	public void bookCab()
//	{
//		System.out.println("cab is booked.....");
//	}
//	
//	// using lambda expression
//	()->System.out.println("cab is booked.....");
//
//}

public class Test {

	public static void main(String[] args) {

		Cab o=()->System.out.println("cab is booked.....");
		o.bookCab();
		
	}

}
