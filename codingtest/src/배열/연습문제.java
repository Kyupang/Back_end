package 배열;

import java.util.Arrays;

public class 연습문제 {

	public static void main(String[] args) {
		String s5 = "[20,10,30,40,50]";
		int sum= 0;
		int[]a = new int[5]; 
		
		s5=s5.replace("["," "); // 비파괴형
		s5=s5.replace("]"," "); // 비파괴형
		s5= s5.trim(); //비파괴형
		String[] s6 = s5.split(","); // 스트링 배열에 넣어주어야함. 
		
		for(int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(s6[i]); 
			sum+=a[i];
		}
		System.out.println(sum);
		Arrays.sort(a); //원본 파괴형 
		System.out.println(Arrays.toString(a));
		
		//스트링은 s5=s5.replace("["," "); // 비파괴형
		//s5=s5.replace("]"," "); // 비파괴형
		//s5= s5.trim(); //비파괴형
		//이런식으로 헀을 때 메모리를 계속 새로운 것을 생성한다. 
		//그러니까 Stringbuilder 나 StringBuffer를 사용한다.
		
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		StringBuffer s3 = new StringBuffer();
		
		
		s2 = s1.append("김길동");
		s1.replace(0, s1.length(), "안녕하세요");
		System.out.println(s1 == s2);
	}

}
