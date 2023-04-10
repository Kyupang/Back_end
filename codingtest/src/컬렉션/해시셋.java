package 컬렉션;

import java.util.HashSet;
import java.util.Scanner;

public class 해시셋 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(5);
		set.add(61);
		set.add(1); //중복이라서 안나옴.
		
		System.out.println(set);
	}

}
