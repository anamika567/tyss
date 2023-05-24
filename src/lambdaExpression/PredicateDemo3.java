package lambdaExpression;

import java.util.function.Predicate;


// Joining Predicates-- and,or,negate
// p1 -- checks number is even
// p2 -- checks greater than 50

public class PredicateDemo3 {

	public static void main(String[] args) {

		int a[]= {12,35,45,68,78,58,96,74,84};
		
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>50;
		
		// and
		
//		System.out.println("Following are numbers even and greater than 50...");
//		
//		for(int n:a)
//		{
//			if(p1.and(p2).test(n)) // p1.test(n) && p2.test(n)
//			{
//				System.out.println(n);
//			}
//		}
//		
		// or
		
//		for(int n:a)
//		{
//			if(p1.or(p2).test(n)) // p1.test(n) && p2.test(n)
//			{
//				System.out.println(n);
//			}
//		}
		
		for(int n:a)
		{
			if(p1.negate().test(n)) // p1.test(n) && p2.test(n)
			{
				System.out.println(n);
			}
		}
		
	}

}
