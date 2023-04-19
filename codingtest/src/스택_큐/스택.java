package 스택_큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class 스택 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("A");
		stack.add("B");
		stack.add("C");
		stack.add("D"); //peek 이다. 스택에서는 맨 마지막에 넣은 숫자가 제일 위에 있게 된다. 
		System.out.println(stack.peek());
		//Collection 친구들은 toArray가 기본적으로 있다.
		
		////////////////////////////////////////////////////////
		Queue<String> queue1 = new LinkedList<String>();
		queue1.offer("dd");
		queue1.poll();
		
		PriorityQueue<String> pqueue1 = new PriorityQueue<String>();
		pqueue1.add("하이");
		pqueue1.poll(); //정렬이 된상태였던 것 같음
		
		///////////////////////////////////////////////
		List<String> list = new ArrayList<String>() ;

		list.add("하이");
		//list.remove(1);
		
		int[] arr = {1, 2, 3};
		List<Integer> list2 = new ArrayList<>(arr.length);
		for (int num : arr) {
		    list2.add(num);
		}
		Collections.sort(list2);
		Collections.reverse(list2);
		System.out.println(list2);
		
		int[] arr2 = new int[list2.size()];
		for(int i = 0;  i < list2.size(); i++) {
			arr[i] = list2.get(i);
		}
		////////////////////////////////////////////////////
		
		
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "사과");
		
		//TreeMap<K, V> 모름.. 
		
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
