package 스택_큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2_큐확인문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		
		for(int i =1; i<=n ; i++) {
			que.add(i);
		}
	
		
		while(!que.isEmpty()) {
			que.poll();
			que.offer(que.poll());
			if(que.size() == 1) {
				break;
			}
		}
		
		System.out.println(que.peek());
		
		
	}

}
