package 동적계획법;

import java.util.Scanner;

public class 피보나치DP_TD {
		static int[] dp;
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			dp  = new int[n+1];
			System.out.println(fibo(n)); //55가 나온다. 1 1 2 3 5 8 13 21 34 55 
			
		}
		
	    // Top-down
		//fibo 는 계속 불리기 때문에 dp[x] x에 들어가는 수가 계속 깎인다. 근데 dp는 static 이기 때문에 값을 가지고 있다. 
		//그래서 있는지 없는지가 확실하고 있으면 리턴하기 때문에 사용하면 아주 메모리 상으로 좋다. 
		static int fibo(int x) {
			if( x ==1 || x==2) return 1;
			if(dp[x] != 0) return dp[x]; 
			dp[x] = fibo(x-1) + fibo(x-2);
			System.out.println(dp[x]);    //여기도 dp[x]값이 다 저장된다. 재귀로 하는 방법이 탑다운.
			return dp[x];
		}
		
		//  Memoization 
		// 하위 문제의 결과 값을 dp[]배열에 저장해놓고 필요할 때마다 계산된 값을 호출
		// 조건1 : 위의 결과는 밑의 결과들을 합쳐서 만들어진다.
		// 조건2 : 밑의 결과를 또 쓰는 상황이 생긴다.
		
		// 조건1만 만족하는 경우에는 
		// 정렬문제(퀵 정렬 - 참조, 병합 정렬 - 참조)
		// 이진 탐색(Binary Search - 참조)
		
}
