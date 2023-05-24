package lambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	int experiance;
	
	Employee(String name,int sal,int exp)
	{
		ename=name;
		salary=sal;
		experiance=exp;
	}
}
public class PredicateDemo2 {

	public static void main(String[] args) {

		// Ex-1
		Employee emp=new Employee("jhon", 50000, 5);
		
		// emp object --> return name if salary>30k and exp>3
		
		Predicate<Employee> pr=e->(e.salary>30000 && e.experiance>3);
		System.out.println(pr.test(emp));
		
		// Ex-2
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("jhon",40000,6));
		al.add(new Employee("david",30000,4));
		al.add(new Employee("renee",20000,2));
		al.add(new Employee("jack",50000,5));
		
		for(Employee e:al)
		{
			if(pr.test(e))
			{
				System.out.println(e.ename+" "+e.salary);
			}
			
		}



		
		
	}
	

}
