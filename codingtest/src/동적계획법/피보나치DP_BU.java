package 동적계획법;

import java.util.Scanner;

public class 피보나치DP_BU {
		static int[] dp;
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			dp  = new int[n+1];
			System.out.println(fibo(n)); //55가 나온다. 1 1 2 3 5 8 13 21 34 55 
			
		}
		
		   // Bottom-up
		static int fibo(int x) {
			dp[1] =1;
			dp[2] =1;
			for(int i=3; i<x+1; i++) {
				dp[i] = dp[i-1] + dp[i-2];  // 1 1 이 있고 dp[3] 에는 2가 들어간다. dp[0]은 없네 
			}
			return dp[x]; // dp[x]를 반환하거나 원하는 인덱스도 추출할 수 있다. 
		}
		
		
}
