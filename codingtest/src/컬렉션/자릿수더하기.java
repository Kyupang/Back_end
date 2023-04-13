package 컬렉션;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 1234;
		Sol sol = new Sol();
		sol.solution(n);
		System.out.println(sol.solution(n));
	}

}

class Sol {
	public int solution(int n) {
		int answer = 0;
		String nstr = Integer.toString(n);
		String[] strArr;
		strArr = nstr.split(""); // 배열로 반환한다. split은
		
		for(int i= 0; i<strArr.length ; i++) {
			answer += Integer.parseInt(strArr[i]);
		}
		
		
		return answer;
	}
}