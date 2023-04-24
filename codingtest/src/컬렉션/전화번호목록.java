package 컬렉션;

import java.util.HashMap;

public class 전화번호목록 {
	public static void main(String[] args) {
		String[] phone_book= {"123","123","456","789"};
		 boolean answer = true;

	        HashMap<String, Integer> map = new HashMap<>();
	        for (String key : phone_book) {
	            map.put(key, 0);
	        }
	        System.out.println(map);

	        for (String key : phone_book) {
	            for (int i = 0; i < key.length(); i++) {
	                String prefix = key.substring(0, i);
	                if (map.containsKey(prefix)) { // key의 접두사인 경우
	                    answer = false;
	                   //return false;
	                }
	            }
	        }

	        System.out.println(answer);
	}
}
