package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열의최댓값구하기 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] a = new int[10];
		int max = a[0];
		
		for(int i =0; i<10; i++) {
			a[i] = r.nextInt(1000);
		}
		
		for(int j=0; j<a.length; j++) {
			if(max < a[j]) {
				max = a[j]; 
			}
		}
		System.out.println(max);
		
		//오름차순으로 정렬한 다음 맨앞(최소값)
							//		맨끝(최대값)
		Arrays.sort(a); //원본을 바꿔버림. 파괴형함수
		System.out.println(a[0]);
		System.out.println(a[9]);
		
		String result= Arrays.toString(a);
		System.out.println(result);
		
	}

}
