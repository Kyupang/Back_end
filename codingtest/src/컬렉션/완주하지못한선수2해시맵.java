package 컬렉션;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수2해시맵 {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String x : participant) {
        	map.put(x,map.getOrDefault(x, 0)+1);
        }
        
        for(String x: completion) {
        	map.put(x, map.get(x)-1);
        }
        
        for(String x: map.keySet()) {
        	if(map.get(x) != 0) {
        		answer = x;
        	}
        }
        
        
        return answer;
        
    }
    
    public static void main(String[] args) {
		String[] a= {"leo", "kiki", "eden"};
		String[] b = {"eden", "kiki"};
		
    	System.out.println(solution(a,b));
	}
}
