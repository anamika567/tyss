package collection_practice;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		Stack<Object> s=new Stack<>();
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
