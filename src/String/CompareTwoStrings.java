package String;

public class CompareTwoStrings {

	public static void main(String[] args) {

		String s1="hello";
		String s2="hello";
	
		    // 1) s1>s2 +ve value
    		// 2) s1==s2 0
		    // 3) s1<s2 -ve value
		
		
		  if(s1.compareTo(s2)==0)
		   {
		     System.out.println("Strings are equal.");
		   }
		  
		else
		{
		   System.out.println("Strings are not equal");
		}
		
		
//		
//		// This will not work in some cases
//		if(s1==s2)
//		{
//			System.out.println("Strings are equal");
//		}
//		else
//		{
//			System.out.println("Strings are not equal");
//		
//		}
//		
		
		
//		if(new String("tony")==new String("tony"))
//		{
//			System.out.println("Strings are equal");
//		}
//		else
//		{
//			System.out.println("Strings are not equal");
//		}
	}

}
