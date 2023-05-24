package lambdaExpression;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f=n->n*n;
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(6));
		
		// String length
		
		// String--> length-->int
		Function<String , Integer> fn=s->s.length();
		System.out.println(fn.apply("welcome")); // 7
		System.out.println(fn.apply("welcome home"));// 12


		

	}

}
