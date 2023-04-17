package 컬렉션;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String answer = "";
		String answer2 = "";
		String s = "aaabbbcdddefe";
		HashSet<String> set = new HashSet<String>();
		//1. 일단 문자열을 하나씩 구분을 할 예정 : 1. split(""), toCharArray(), charAt(index)
		String[] s2 = s.split("");
		//2. 어떤 문자들이 들어있는지 목록을 만들자.
		// 중복을 없애면 목록을 구할 수 있을 것 같다.
		// HashSet을 사용하면 되겠다.
		
		for(String x : s2) {
			set.add(x);
		}
		
		
		List<String> list = Arrays.asList(s2);
		
//		Object[] set2 = set.toArray();
//		
//		for(Object x : set2) {
//			if(Collections.frequency(list, x) == 1) {
//				answer += x;
//			}
//		}
		
		Iterator<String> iterator = set.iterator();
		for(int i=0;i<list.size();i++) {
			String x = iterator.next();
			if(Collections.frequency(list, x) == 1) {
				answer +=x;
			}
		}
		
		String[] answerStr = answer.split("");
        Arrays.sort(answerStr);
        
        for(String x: answerStr) {
        	answer2+= x;
        }
		
		
		System.out.println(answer2);
		
		
		
		
		
	}

}
