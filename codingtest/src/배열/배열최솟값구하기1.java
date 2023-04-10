package 배열;

public class 배열최솟값구하기1 {
	private static void selection_sort(int[]a) {
		for(int i=0; i< a.length-1; i++) {
			int min_index=i;
			
			for(int j=i+1; j<a.length ; j++) {
				if(a[j] < a[min_index]) {
					min_index = j;
				}
			}
			swap(a,min_index,i);
		}
	}
	
	private static void swap(int[]a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void main(String[] args) {
		//1. 선택 정렬(selection sort) O(N^2)
		int[] a = {90,80,20,60,70};
		
		
		selection_sort(a);
		System.out.println(a[0]);
		
		
		//2. 그냥 n만큼만 돌면 되는 값 min하나 저장해주고 업데이트 시키면댐 O(N)
		int min = a[0];
		for(int x: a) {
			if(min > x) {
				min = x;
			}
		}
		System.out.println(min);
		
	}
	
	

}
