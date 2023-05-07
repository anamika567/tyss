package assignment;

public class Question2 {

	public static void main(String[] args) {

		String s="Anamika is in heaven"; // AnAmIkA Is iN HeAvEn
		String st=s.toLowerCase();
		for(int i=0;i<st.length();i++) 
		{
			char ch = st.charAt(i);
			if(i%2==0)
			{
				ch=Character.toUpperCase(ch);
			}
			else
			{
				ch=st.charAt(i);
			}
			System.out.print(ch);
		}
		
	}

}
