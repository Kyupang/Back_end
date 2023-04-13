package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열과컬렉션변환2 {
	// 배열을 가지고 하면 복잡한 처리가 있으면 List로 하면 편하다.
	// 검색, 수정, 인덱스의 작업을 하려면 List<String> = Arrays.asList(a);
	// 추가 삭제, 삽입의 작업을 하시려면 모든 기능을 가진 ArrayList를 새로 만들어주면 됨.

	public static void main(String[] args) {

		String[] s2 = { "aaa", "bbb", "ccc", "aaa" };
		
		List<String> s2List = new ArrayList<>(Arrays.asList(s2));
		s2List.add("냐미");
		s2List.remove(1);
		
		
		////////////////////////////////////////////////
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(600);
		list.add(200);
		list.add(800);
		list.add(700);
		list.add(300);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		int[] array = new int[list.size()];
		for(int i = 0; i<array.length ; i++) {
			array[i]= list.get(i);
		}
		System.out.println(Arrays.toString(array));
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i = 0; i<array.length ; i++) {
			arrList.add(array[i]);
		}
		System.out.println(arrList);
	}

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}

}
