package lambdaExpression;

import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) {

		Consumer<String> c=s->System.out.println(s);
		c.accept("welcome");
	}

}
