package 배열;

public class 배열확인 {

	public static void main(String[] args) {
		int sum= 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum= sum-i;
			}else {
				sum= sum+i;
			}
		}
		
		System.out.println(sum);
		
		
		for(int i =0; i<10 ; i++) {
			for(int j=0; j<10 ; j++) {
				System.out.print(j+" ");
			}
			System.out.println(i+" ");
		}
		
			
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			System.out.println();
		}
			
		
		
	}

}
