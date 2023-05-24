package lambdaExpression;


@FunctionalInterface
interface Ola
{
	public void bookOla(String src,String dest);
}
public class Demo {

	public static void main(String[] args) {
		Ola c=(source,destination)->System.out.println("Ola cab is booked from " +source+ " to " +destination);
		c.bookOla("bangalore", "mysore");

	}

}
