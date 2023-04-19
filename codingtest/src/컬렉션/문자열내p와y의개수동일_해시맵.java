package 컬렉션;

import java.util.HashMap;

public class 문자열내p와y의개수동일_해시맵 {

	public static void main(String[] args) {
		String s = "pPoooyY";
		String s2 = s.toLowerCase();
		System.out.println(s);
		String[]s3 = s2.split("");
		
		//Collections.ferquency 같은 기능을 한다.
		//KeySet은 Hashset을 iterator로 돌리는 불편함을 해소한다.
		
		HashMap<String, Integer> map = new HashMap<>();
		for(String key : s3) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		System.out.println(map);
		System.out.println(map.get("p") == map.get("y"));
	}

}
