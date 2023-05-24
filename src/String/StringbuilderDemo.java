package String;

public class StringbuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("Tony");
		System.out.println(sb);
		
		// charAt()
		System.out.println(sb.charAt(0));
		
		// set char at index 0
		sb.setCharAt(0,'P');
		System.out.println(sb);
		
		// insert
		sb.insert(2, 'n');
		System.out.println(sb);

		// delete
		sb.delete(2, 3);
		System.out.println(sb);
		
		//append
		StringBuilder s=new StringBuilder("h");
		s.append("e");
		s.append("l");
		s.append("l");
		s.append("o");
		System.out.println(s);

		// length
		System.out.println(s.length());
		
		// reverse
		StringBuilder sbb=new StringBuilder("Hello");
		
		for(int i=0;i<sbb.length()/2;i++)
		{
			int front =i;
			int back=sbb.length()-1;
			
			char frontChar=sbb.charAt(front);
			char backChar=sbb.charAt(back);
			
			sbb.setCharAt(front, backChar);
			sbb.setCharAt(back, frontChar);
			
			
		}
		System.out.println(sbb);
		
	}

}
