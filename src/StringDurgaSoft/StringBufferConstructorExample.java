package StringDurgaSoft;

public class StringBufferConstructorExample {

	// Default capacity StringBuffer() is 16.
	// new capacity=(current capacity+1)*2
	
	public static void main(String[] args) {

       //1.
		StringBuffer sb=new StringBuffer();
		sb.append("abcdefghijklmnop");// 16
		sb.append("q"); //17
		System.out.println(sb.capacity()); //34

		sb.append("abcdefghijklmnop");//16
		sb.append("q"); //34
		sb.append("l"); //35
		System.out.println(sb.capacity()); //70
		

		//2.
		StringBuffer sb1=new StringBuffer(1000);
		System.out.println(sb1.capacity()); // 1000
		
		//3.
		StringBuffer sb2=new StringBuffer("durga");
		System.out.println(sb2.capacity()); // sb2.length()+16=21
		
		
	}

}
