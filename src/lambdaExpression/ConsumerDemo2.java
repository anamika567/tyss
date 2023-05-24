package lambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employ
{
	String ename;
	int salary;
	String gender;
	
	Employ(String ename, int salary,String gender)
	{
		this.ename=ename;
		this.salary=salary;
		this.gender=gender;
	}
	
}

	
public class ConsumerDemo2 {

	public static void main(String[] args) {
ArrayList<Employ> empList=new ArrayList<Employ>();
		
		empList.add(new Employ("david",50000,"male"));
		empList.add(new Employ("ketty",20000,"female"));
		empList.add(new Employ("lara",30000,"female"));
		empList.add(new Employ("jon",40000,"male"));

        // function
		Function<Employ, Integer> f=emp->(emp.salary*10)/100; // task 1
		
		// Predicate
		Predicate<Integer> p=b->b>=5000;                     // task 2
		
		// Consumer                                         // task 3
		Consumer<Employ> c=emp->{
			                      System.out.println(emp.ename);
			                      System.out.println(emp.salary);
			                      System.out.println(emp.gender);
			
		                       };
		                       
		for(Employ e:empList)
		{
			int bonus = f.apply(e); // invoked function
			
			if(p.test(bonus))    // invoked predicate
			{
				c.accept(e);     // invoked consumer
				System.out.println("Employee bonus: "+bonus);
			}
		}
		                       
	}

}
