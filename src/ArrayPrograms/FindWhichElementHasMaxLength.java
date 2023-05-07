package ArrayPrograms;

public class FindWhichElementHasMaxLength {

	public static void main(String[] args) {

		String a[]= {"abc","nkomk","ssas","dd"};
		String maxLen=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(maxLen.length()<a[i].length())
			{
				maxLen=a[i];
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(maxLen.length()==a[i].length())
			{
				maxLen=a[i];
				System.out.print(a[i]);
			}
		}
	}

}
