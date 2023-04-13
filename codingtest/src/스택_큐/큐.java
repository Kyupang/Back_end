package 스택_큐;

import java.util.LinkedList;
import java.util.Queue;

public class 큐 {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
        
        que.offer("A");
        que.add("B");
        que.add("C");
        
        
        
        System.out.println(que.peek());
        System.out.println("## Queue");
        while(!que.isEmpty()) {
            System.out.println(que.poll());
        }
	}

}
