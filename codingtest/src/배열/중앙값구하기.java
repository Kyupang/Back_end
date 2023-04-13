package 배열;

import java.util.*;
public class 중앙값구하기 {

	public static void main(String[] args) {
		int[] s = {5,2,1,9,11,15,17};
		System.out.println(solution(s));
	}
	
	public static int solution(int[] a) {
		int answer = 0;
		Arrays.sort(a);
		answer = a[(a.length)/2];
		
		return answer;
	}
}
