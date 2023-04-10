package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//자바프로그램과 콘솔(키보드)를 스트림(강물) open
//		int[] numbers = new int[3];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = sc.nextInt();
//			//입력받아서, int로 바꾼후, 배열에 넣어라!
//		}
//		sc.close();//stream close
//		for (int x : numbers) {
//			System.out.println(x);
//		}
		
		Scanner sc = new Scanner(System.in);
		double[] arrays = new double[5];
		for (int i = 0; i < arrays.length; i++) {
			arrays[i]= sc.nextDouble();
		}
		
		
		for (int i = 0; i < arrays.length; i++) {
			if(arrays[i] == 22.2) {
				System.out.println(i);
			}else if(arrays[i] == 33.3){
				System.out.println(i);
			}
		}
//////////////////////////////////////////////////////////////
		int count = 0;
		double[] arrays2 = new double[5];
		for (int i = 0; i < arrays.length; i++) {
			arrays2[i]= sc.nextDouble();
		}
		for (int i = 0; i < arrays.length; i++) {
			if(arrays[i] == 22.2) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
		
	}
}