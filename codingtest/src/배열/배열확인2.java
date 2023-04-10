package 배열;

public class 배열확인2 {

	public static void main(String[] args) {
		//배열을 만드는 방법
		//1.배열만들 때 부터 값을 알고있는 경우
		int[] ages = {60,50,30,20,10};
		//2.배열을 만들 때는 값을 모르고 있다가 나중에 넣는 경우
		double[] weight = new double[5];
		weight[0] = 77.8;
		weight[1] = 45.5;
		weight[2] = 88.5;
		weight[3] = 99.5;
		weight[4] = 33.2;
		
		//for문 2가지 
		//1) c타입
		for (int i = 0; i < weight.length; i++) {
			System.out.println(ages[i]+ " "+ weight[i]);
		}
		
		//2) for-each
		for (double x : weight) {
			System.out.println(x);
		}
				
	}

}
