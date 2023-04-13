package 동적계획법;

import java.util.HashSet;

public class N으로표현 {
	static int answer = -1;

	public static void main(String[] args) {
		int N = 5;
		int number = 12;
		int answer =-1;
		if(N == number) {
			answer =1;
		}
		
		// 1-8번까지의 N사용 횟수별로 만들 수 있는 모든 수를 중복없이 저장
		HashSet<Integer>[] set = new HashSet[8]; 
		int n = 0;
		// 초기화 (1~8까지 n의 연속수를 넣어줌 - ex) 5,55,555,5555,...
		for (int i = 0; i < 8; i++) {
			n = (n * 10) + N;
			set[i] = new HashSet<>();
			set[i].add(n);
		}
		
		for(int i= 1; i<8; i++) { //  N 2개로 만들 수 있는 조합 부터 8개로 만들 수 있는 조합까지. 돌면서
			for(int j=0; j<i ; j++) { // 그 전에 있는 셋들을 순회하며 // i가 6이면 j는 5까지 돌면서  
				for(Integer op1 : set[j]) {  //6 = 1+5, 2+4 , 3+3 , 4+2 , 5+1 의 조합이잖아? 그러니까 
												// 5를 예로들면 5번을 써서 만들 수 있는 수에 1개를 써서 만들수 있는 조합과 연산한 숫자들을 
												// 6번째 셋에 저장하는 것
					for(Integer op2 : set[i-j-1]) {
						set[i].add(op1+op2);
						set[i].add(op1-op2);
						set[i].add(op1*op2);
						
						if(op1 != 0) {
							set[i].add(op2/op1);
						}
						if(op2 != 0) {
							set[i].add(op1/op2);
						}
					}
				}
			}
			if(set[i].contains(number)) {
				answer = i+1;
				break;
			}
		}
		System.out.println(answer);
		
	}
}
