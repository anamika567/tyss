package programs;

public class SumOfDigitsInAString {

	public static void main(String[] args) {
		
		String s="dfkm231gyh63"; // 15
		int sum=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum=sum+(s.charAt(i)-48);
			}

		}
		System.out.print(sum);

	}

}
