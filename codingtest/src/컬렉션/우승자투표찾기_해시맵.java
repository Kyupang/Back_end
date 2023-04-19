package 컬렉션;

import java.util.HashMap;
import java.util.HashSet;

public class 우승자투표찾기_해시맵 {

	public static void main(String[] args) {
		String[] all = { "홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동" };
		String[] find = { "홍길동", "김길동", "정길동" };

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// key, value

		for (String x : find) {
			map.put(x, 0);
		}
		System.out.println(map);

		// 같은 Key로 다시 put하면 덮어씀.
		//all을 돌면서 map의 그 키의 value를 +1 하면 된다.
		for (String x : all) {
			map.put(x, map.get(x) + 1);
		}
		System.out.println(map);
		
		int max = 0;
		String winner = "";
		// map의 key를 set 형태로 반환해준다. 
		for(String key: map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				winner = key;
			}
		}
	}

}
