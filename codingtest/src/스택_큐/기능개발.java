package 스택_큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {

	 public int[] solution(int[] progresses, int[] speeds) {
		 	
		 	List<Integer> answerList = new ArrayList<>(); 
		 	int temp = 0;
	        int count = 0;
	        
	        
	        Queue<Integer> que = new LinkedList<>();
	        
	        for(int i =0 ; i< progresses.length ; i++) {
	        	que.add((int)Math.ceil((100 - progresses[i])/(double)speeds[i]));
	        }
	        
	        while(!que.isEmpty()) {
	            temp = que.poll();
	            count=1;
	            while(!que.isEmpty() && temp >= que.peek()) {
	                que.poll();
	                count++;
	            }
	            answerList.add(count);
	        }
	        int[] answer = new int[answerList.size()];
	        
	        for(int i=0;i< answerList.size() ; i++) {
	        	answer[i] = answerList.get(i);
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		기능개발 sol = new 기능개발();
		int[] progress = {90,90,90,90};
		int[] speeds = {30,1,1,1};
		int[] answer = sol.solution(progress, speeds);
		
		
		
	}

}
