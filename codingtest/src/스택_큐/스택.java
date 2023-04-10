package 스택_큐;

import java.util.Stack;

public class 스택 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
