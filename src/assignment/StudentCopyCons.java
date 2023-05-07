package assignment;

public class StudentCopyCons {
	
	int i;
	int j;
	StudentCopyCons(int i,int j)
	{
		this.i=i;
		this.j=j;
	}

	StudentCopyCons(StudentCopyCons c)
	{
		i=c.i;
		j=c.j;
		System.out.println("copy constructor:");
	}
	public void display()
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
	public static void main(String[] args) {
		
		StudentCopyCons c1=new StudentCopyCons(5,7);
		StudentCopyCons c2=new StudentCopyCons(c1);
		c1.display();
		c2.i=8;
		c2.j=9;
		c2.display();
		System.out.println("------------------");
		c1.i=45;
		c1.j=55;
		c1.display();
		System.out.println("------------------");
		c2.i=33;
		c2.j=74;
		c2.display();

	}

}
