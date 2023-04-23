package 스택_큐;

import java.util.Stack;

public class 올바른괄호_스택 {

	public static void main(String[] args) {
//		String s ="()()";
		String s =")(()((";
		boolean answer = false;
		String[] s2 = s.split("");
		
		Stack<String> stack;
		try {
			stack = new Stack<String>();
			for(int i = 0; i<s2.length; i++) {
				if(s2[i].equals("(")) {
					stack.push("(");
				}else {
					stack.pop();
				}
			}
			answer = stack.empty();
			
			System.out.println(stack);
			
		} catch (Exception e) {
			answer = false;
		}
		System.out.println(answer);
		
	}

}
