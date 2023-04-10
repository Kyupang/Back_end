package 스택_큐;

import java.util.LinkedList;
import java.util.Queue;

public class 같은숫자는싫어 {
	static int[] solution(int []arr) {
        
        Queue<Integer> que = new LinkedList<Integer>();
        
        for(int i=0;i<arr.length-1;i++) {
        	if(arr[i]!= arr[i+1]) {
        		que.add(arr[i]);
        	}
        }que.add(arr[arr.length-1]);
        
        int[] answer = new int[que.size()];
        
        for(int i=0;i<answer.length;i++) {
        	answer[i]= que.poll();
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] a = {1,1,3,3,0,1,1};
		solution(a);
	}

}
