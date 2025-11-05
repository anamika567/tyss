package StringDurgaSoft;

public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("java");
		
		// 1. length()
		System.out.println(sb.length());
		
		// 2. capacity()
		System.out.println(sb.capacity());
		
		// 3. charAt()
		System.out.println(sb.charAt(2));
		
		// 4. setCharAt()
		sb.setCharAt(0, 'Y');
		System.out.println(sb);
		
		// 5. append()
		System.out.println(sb.append('P'));
		System.out.println(sb.append(35.222));
		System.out.println(sb.append("durga"));
		System.out.println(sb.append(5.2));
		System.out.println(sb.append(true));
		System.out.println(sb.append(10));
		
		System.out.println();
		
		// 6. insert()
		StringBuffer sb1=new StringBuffer("java");
		sb1.insert(2, "program");
		System.out.println(sb1);
		
		// 7. delete()
		StringBuffer sb2=new StringBuffer("abcdefgh");
		sb2.delete(2, 5);
		System.out.println(sb2);
		
		// 8. deleteCharAt()
		StringBuffer sb3=new StringBuffer("abcdefgh");
		sb3.deleteCharAt(3);
		System.out.println(sb3);
		
		// 9. reverse()
		StringBuffer sb4=new StringBuffer("anamika");
		sb4.reverse();
		System.out.println(sb4);
		
		// 10. setLength()
		StringBuffer sb5=new StringBuffer("AnamikaSingh");
		sb5.setLength(8);
		System.out.println(sb5);
		
		// 11. ensureCapacity()
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());
		s.ensureCapacity(1000);
		System.out.println(s.capacity());
		
		// 12. trimToSize()
		StringBuffer sb6=new StringBuffer(1000);
		sb6.append("abc");
		System.out.println(sb6.capacity());
		sb6.trimToSize();
		System.out.println(sb6.capacity());

		



	}

}
