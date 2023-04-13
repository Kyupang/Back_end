package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열을콜렉션으로콜렉션을배열로 {
	public static void main(String[] args) {
		int[] s = {5,2,1,9,11,15,17};
		Arrays.sort(s);
		print(s);
		int[] reversedS = new int[s.length];
		int j = s.length-1;
		for(int i=0 ; i<s.length; i++) {
			reversedS[j] = s[i];
			j--;
		}
		print(reversedS);
		
		
		String[] s2 = {"aaa","bbb","ccc"};
		List<String> strList = Arrays.asList(s2);
		System.out.println(strList.contains("aaa"));
		
		List<String> list = new ArrayList<>(Arrays.asList(s2));
		String[] strArr =list.toArray(new String[list.size()]);
		
		System.out.println(Arrays.toString(strArr));
		
		
		String[] 냉장고음식 = {"감자", "고구마", "우유", "감자", "양파"};
		List<String> 냉장고음식arrlist = new ArrayList<String>(Arrays.asList(냉장고음식));
		//1.
		System.out.println(냉장고음식arrlist.lastIndexOf("감자"));
		//2.
		if(냉장고음식arrlist.contains("양파")) {
			System.out.println("양파는 안사와도 된다.");
		}
		//3.
		냉장고음식arrlist.set(2, "춘식이 우유");
		System.out.println(냉장고음식arrlist.get(2));
		
		//5.
		냉장고음식 = 냉장고음식arrlist.toArray(new String[냉장고음식arrlist.size()]);
		System.out.println(Arrays.toString(냉장고음식));
	}
	public static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
