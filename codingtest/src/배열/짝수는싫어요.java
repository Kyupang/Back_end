package 배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		int n = 10;
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(n);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution3 {
	public int[] solution(int n) {
		//정답이 들어갈 배열의 길이 계산해주어야 함.
		//짝수  => 1/2, 홀수 => 1/2 + 1(자기자신)
		
		int size = 0;
		int[] answer = new int[size];
		//1. 10 => 1~10까지 중에서 홀수만 구해야함.
		//   반복문을 돌면서
		//   숫자하나씩을 꺼내어 
		//   if문으로 홀수인지판단
		//   2로 나누어서 나머지가 0이 아니면!로 판단
		//2. answer배열 0번 인덱스부터 차례대로 넣어준다.
		//   answer배열 0번 인덱스를 카운트할 변수가 필요
		//   j = 0시작, 반복문돌때마다 j++;해주어야함.
		//==> 순서도 그려보자.!!!!
		return answer;
	}
}
