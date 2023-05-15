package assignment;

public class InterviewQuestion {

	public static void main(String[] args) {

		
		String str="aabbcef"; // a2b3cdef
		char[] ch=str.toCharArray();
		int count=49;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]) 
				{
					count++;
				    ch[j]=(char) count;
			    }
		    }
		}
	String st=new String(ch);
	System.out.println(st);
	}

}
