package 정렬;

public class 선택정렬 {
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
		
	}
	
	

}
