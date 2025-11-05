package durga_soft_collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack s=new Stack<>();
		s.push("a");
		s.push("b");
		s.push("c");
		System.out.println(s);
		System.out.println(s.search("a"));
		System.out.println(s.search("z"));
	}

}
