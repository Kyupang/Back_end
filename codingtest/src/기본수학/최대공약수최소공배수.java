package 기본수학;

public class 최대공약수최소공배수 {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 10;
		
		System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
		
	}
	
	public static int gcd(int a, int b) { 
		if(a<b) {  //큰수가 항상 a에 들어오도록 한다! 
			int temp = a;
			a = b;
			b = temp;
		}
		while(b!= 0) {
			int r = a%b;
			a= b; //a에다가 작은 수 b를 대입
			b= r; //b에다가 나머지를 대입 해서 다시 반복
		}	
		return a;
	}
	
	public static int lcm(int a , int b) {
		return (a*b)/gcd(a,b); // 최대공약수로 두 수를 곱한 수를 나누면 최소공배수
	}

}
