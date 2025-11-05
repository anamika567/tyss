package java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {

		String ar[]= {"java","python","c++","perl"};
		System.out.println("Print Array:" +Arrays.toString(ar));
		List<String> list=new ArrayList<String>();
		for(String s:ar)
		{
			list.add(s);
		}
		System.out.println("Print List:"+list);
	}

}
