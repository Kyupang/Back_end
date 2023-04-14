package 배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 리버스어레이 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		List<Integer> list2 = new ArrayList<>(arr.length);
		for (int num : arr) {
		    list2.add(num);
		}
		Collections.sort(list2);
		Collections.reverse(list2);
		System.out.println(list2);
		
		int[] arr2 = new int[list2.size()];
		for(int i = 0;  i < list2.size(); i++) {
			arr[i] = list2.get(i);
		}
		
		//List의 경우 Collections.reverse();로 풀수있음.
		String[]strArr = {"abcs","abba","abdd"}; 
		List<String> strList = Arrays.asList(strArr);        
        Collections.sort(strList); 
        Collections.reverse(strList);        
        strArr = strList.toArray(new String[strList.size()]); 
        System.out.println(Arrays.toString(strArr)); 
		
	}

}
