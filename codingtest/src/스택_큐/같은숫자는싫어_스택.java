package 스택_큐;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 같은숫자는싫어_스택 {
	
	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);//1
		for (int x : arr) {
			if(x != stack.peek()) {//top값 get
				stack.push(x);
			}
		}
		System.out.println(stack);
		
		int[] answer = new int[stack.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack.get(i);
		}
		for (int i = answer.length -1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));

	}
	
}
