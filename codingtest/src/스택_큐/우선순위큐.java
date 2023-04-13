package 스택_큐;

import java.util.PriorityQueue;

public class 우선순위큐 {
	class Solution {
	    public int solution(int[] scoville, int K) {
	        int answer = 0;
	        
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	        
	        for (int pri : scoville) {
	            pq.offer(pri);
	        }
	        
	        while(!pq.isEmpty()) {
	        	if(pq.size() == 1) {
	        		if(pq.peek() >= K) {
	        			return answer;
	        		}else {
	        			return -1;
	        		}
	        	}
	        	
	        	if(pq.peek() >= K) {
	        		return answer;
	        	}else {
	        		int first = pq.poll();
	        		int second = pq.poll();
	        		
	        		int result = first + (second*2);
	        		pq.offer(result);
	        		
	        		answer++;
	        	}
	        	
	        	
	        }
	        return -1;
	    }
	}
	
	
	public static void main(String[] args) {
		int[] a= {1,2,3,45,67};
		int k= 7;
		int answer = 0;
		
        
	}

}
