package lambdaExpression;

import java.util.function.Predicate;

// Predicate  --> one parameter return boolean
// use only if you have conditional check in program

public class PredicateDemo {

	public static void main(String[] args) {

		// Ex- 1
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(20)); // true
		System.out.println(p.test(5)); // false

		// Ex- 2 check the length of the given string is greater than 4 or not.
		
		Predicate<String> pr=s->(s.length()>4);
		System.out.println(pr.test("welcome")); // true
		System.out.println(pr.test("wel")); // false

		// Ex -3 print array element whose size is greater than 4 from array
		
		String names[]= {"david","scott","maxwell","jhon"};
		
		for(String name:names)
		{
			if(pr.test(name))
			{
				System.out.println(name);
			}
		}
		
		
	}
	

}
