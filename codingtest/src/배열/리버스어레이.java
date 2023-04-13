package 배열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 리버스어레이 {

	public static void main(String[] args) {
		int[]a = {1,6,5,16,7,8,9};
		//단순 리버스 어레이
		System.out.println(Arrays.toString(reverseArray(a)));
		//내림차순 정렬 
		System.out.println(Arrays.toString(sortReverseArray(a)));
		
		//객체의 경우 Collections.reverse();로 풀수있음.
		String[]strArr = {"abcs","abba","abdd"};
		List<String> strList = Arrays.asList(strArr);        
        Collections.sort(strList);
        Collections.reverse(strList);        
        strArr = strList.toArray(new String[strList.size()]);
        System.out.println(Arrays.toString(strArr));
		
	}
	public static int[] reverseArray(int[] arr) {
	    int[] reversedArr = new int[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        reversedArr[arr.length - 1 - i] = arr[i];
	    }
	    return reversedArr;
	}
	
	public static int[] sortReverseArray(int[] arr) {
		Arrays.sort(arr);
		int[] reversedArr = new int[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        reversedArr[arr.length- 1 - i] = arr[i];
	    }
	    
	    return reversedArr;
	}
}
