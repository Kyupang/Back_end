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
		
		for(int x: a) {
			System.out.print(x+" ");
		}
	}

}
