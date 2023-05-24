package lambdaExpression;

interface Taxi
{
	public String bookCab(String src,String dest);
	
}

//class Uber implements Taxi
//{
//	public String bookCab(String src,String dest)
//	{
//		System.out.println("Taxi is booked from "+src+ "To" +dest);
//		return ("price : 5000Rs");
//	}
//	
//}

public class Test2 {

	public static void main(String[] args) {

		Taxi c=(src,dest)->{
			System.out.println("Taxi is booked from "+src+ "To" +dest);
			return ("price : 5000Rs");
		                   };
		System.out.println(c.bookCab("mysore", "otty"));

	}

}
