package ArrayPrograms;

public class FindWhichElementHasMinLength {

	public static void main(String[] args) {

		String a[]= {"abc","nkomk","ssas","dd"};
		String minLen=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(minLen.length()>a[i].length())
			{
				minLen=a[i];
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(minLen.length()==a[i].length())
			{
				minLen=a[i];
				System.out.print(a[i]);
			}
		}

	}

}
