package 배열;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열정렬리턴 {

	public static void main(String[] args) {
		// int[] array = { 6, 9, 7, 3 };
		int[] array = { 5, 9, 7, 10 };
		int divisor = 5;
		Solution4 sol = new Solution4();
		int[] answer = sol.solution(array, divisor);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution4 {
	public int[] solution(int[] array, int divisor) {
		ArrayList<Integer> list = new ArrayList<>();
		// 수도코드(가짜코드)
		// 1. 결과를 넣을 수 있는 List를 만들어둔다.
		// 2. 반복문 이용해서 배열에 있는 요소 하나씩 꺼내
		// 3. divisor로 나누었을 때 나머지가 없는지 체크해서
		// 나머지가 없으면 list에 모으자.
		for (int i = 0; i < array.length; i++) {
			if (array[i] % divisor == 0) {
				list.add(array[i]);
			}
		}
		System.out.println(list.size() + ">> " + list);
		// 2>> [5, 10]
		int[] answer = null; // {0,0}
		if (list.size() != 0) {
			answer = new int[list.size()];
			// int값 list를 배열에 자동으로 넣어주는 함수XXX!!!
			for (int i = 0; i < list.size(); i++) {
				// answer[i] <--- list.get(i)
				answer[i] = list.get(i);
				// {5, 0} <-- [5, 10]
				// {5, 10} <-- [5, 10]
			}
		} else {
			answer = new int[1];
			answer[0] = -1;
		}
		return answer;
	}
}
