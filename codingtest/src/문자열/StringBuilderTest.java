package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s = "pongpong";
		String s2="pongpong";
		
		System.out.println(s == s2); //주소 비교
		System.out.println(s.equals(s2)); //주소가 가르키는 값 비교 
		
		s = "haahah";
		
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("honghong");
		System.out.println(sb1);
		sb1.replace(0, 4, "haha");
		sb1.reverse();
		System.out.println(sb1);
		sb1.delete(0, sb1.length());
		System.out.println(sb1);
		
		
		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb2);
		
		
		System.out.println(sb1 == sb2);
		
		String[] s4 = s.split("");
		List<String> list = Arrays.asList(s4);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		// 스트링 배열을 split으로 만든 다음, string builer에 append하고 toString 해주면 string 으로 반환됨, 
		
		
	}

}
