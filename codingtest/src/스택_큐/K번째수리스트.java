package 스택_큐;

import java.util.Arrays;

public class K번째수리스트 {

	public static void main(String[] args) {
		int[] num = {3,4,5,7,1,2};
		int k = 2;
		
		Arrays.sort(num);
		String num2 = Arrays.toString(num);
		System.out.println(num2);
		System.out.println(num[k-1]);
		
		
	}

}
