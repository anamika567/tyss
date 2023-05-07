package assignment;

public class ReverseTheFirstAndLastWord {

	public static void main(String[] args) {
		
		String s="This is a sentence"; // o/p: sihT is a ecnetnes 
		String n[]=s.split(" ");
		for(int i=0;i<n.length;i++)
		{
			String st=n[i];
			if(i==0 || i==n.length-1)
			{
				String rev="";
				for(int j=0;j<st.length();j++)
				{
					rev=st.charAt(j)+rev;
				}
				System.out.print(rev+" ");
			}
			else
				System.out.print(st+" ");
		}
	}

}
