package collectioninJava;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		
		System.out.println(s);
		
		s.pop();
		s.pop();
		System.out.println("Pop"+ s);
		
		s.peek();
		
		System.out.println("peek"+ s);
		
		
		System.out.println(s.search("A"));
		System.out.println(s.search("E"));
		
	// TODO Auto-generated method stub

	}

}
