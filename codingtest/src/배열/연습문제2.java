package 배열;

import java.util.Arrays;

public class 연습문제2 {

	public static void main(String[] args) {
		String all = "국어,   영어,컴퓨터   , 수학";
		String[] strarr = all.split(",");
		for(int i=0;i<strarr.length; i++) {
			strarr[i] = strarr[i].trim();
			System.out.println(strarr[i]);
			if(strarr[i].length() == 3) {
				System.out.println(i);
			}
		}
		
		
	}

}
