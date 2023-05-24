package lambdaExpression;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employe
{
	String ename;
	int salary;
	
	Employe(String ename, int salary)
	{
		this.ename=ename;
		this.salary=salary;
		
	}
	
}
public class FunctionDemo2 {

	public static void main(String[] args) {
ArrayList<Employe> empList=new ArrayList<Employe>();
		
		empList.add(new Employe("david",50000));
		empList.add(new Employe("ketty",20000));
		empList.add(new Employe("lara",30000));
		
		Function<Employe, Integer> fn=e->{
			
			                      int sal=e.salary;
			                      if(sal>=10000 && sal<=20000)
			                    	  return (sal *10/100);
			                      else if(sal>=20000 && sal<=30000)
			                    	  return (sal *20/100);
			                      else if(sal>=30000 && sal<=40000)
			                    	  return (sal *30/100);
			                      else
			                    	  return (sal *40/100);
		                                  };
		                                  
		     Predicate<Integer> p=b->b>5000;                             
		
		for(Employe emp:empList)
		{
			int bonus=fn.apply(emp);  // using function
			
			if(p.test(bonus)) // using predicate
			{	
			System.out.println(emp.ename+" "+emp.salary);
			System.out.println("Bonus is:"+bonus);
			}
		}


		

	}

}
