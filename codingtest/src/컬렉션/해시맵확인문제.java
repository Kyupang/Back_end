package 컬렉션;

import java.util.HashMap;

public class 해시맵확인문제 {

	public static void main(String[] args) {
		String[] result = {"apple","banana","apple","banana","melon","apple"};
		String[] find = {"apple","banana","melon"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String x: find) {
			map.put(x,0);
		}
		System.out.println(map);
		
		for(String x : result) {
			map.put(x, map.get(x)+1);
		}
		System.out.println(map);
		
		int max = 0;
		String winner = ""; 
		for(String x : map.keySet()) {
			if(map.get(x) > max) {
				max = map.get(x);
				winner = x;
			}	
		}
		
		System.out.println(winner);
		
		
		
	}

}
