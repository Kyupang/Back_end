package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째수트리셋 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); //k번째 작은 수, 3
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		while(true) {
			int data = sc.nextInt();
			if( data == 0) {
				break;
			}else {
				tree.add(data);
			}
		}
		System.out.println(tree);
		
		Object[] arr = tree.toArray();
		Integer[] a =(Integer[])arr;
		
		System.out.println("첫 번째 작은 수 : " + arr[0]);
		System.out.println("두 번째 작은 수 : " + arr[1]);
		System.out.println(k + "번째 작은 수 : " + arr[k - 1]);
	}

}