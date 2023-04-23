package 컬렉션;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램_슬라이딩윈도우_해시맵 {

	public static void main(String[] args) {
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = null;
		
		//abc를 만들 수 있는 갯수를 구하라! 
		Scanner sc = new Scanner(System.in);
		String data = sc.next(); //abccbasabc
		String ana = sc.next(); // abc
		
		String[] data2 = data.split("");
		String[] ana2 = ana.split("");
		
		System.out.println(ana2.length);
		for(int i=0; i< ana2.length; i++) {
			map1.put(ana2[i], map1.getOrDefault(ana2[i], 0) +1);
		}
		System.out.println(map1);
		
		int count = 0;
		for(int i = 0; i< data2.length-1; i++) {
			map2 = new HashMap<String, Integer>();
			int start = i;
			int end = i + map1.size() -1;
			
			if(end >= data2.length -1) {
				end = data2.length-1;
			}
			System.out.println(start+" " + end);
			for(int j = start; j<=end; j++) {
				map2.put(data2[i], map2.getOrDefault(data2[i], 0)+1);
			}
			System.out.println(map2);
			if(map1.equals(map2)) {
				count++;
			}
			System.out.println("----------------------------------count : "+count);
		}
		
		
		
	}

}
