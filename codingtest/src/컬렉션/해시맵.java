package 컬렉션;

import java.util.HashMap;
import java.util.HashSet;

public class 해시맵 {
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "사과");
		map1.put("2", "포도");
		map1.put("3", "복숭아");
		
		System.out.println(map1);
		System.out.println(map1.get("1"));
		
		
		
	}
}
