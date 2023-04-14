package 문자열;

public class 문자열안에문자열 {

	public static void main(String[] args) {
		String s = "abW345vaVafgq";
		String s2 = "W345";
		
		Solution0 sol = new Solution0();
		
		
	}

}

class Solution0 {
	public int solution(String str1, String str2) {
		int answer = 0;
		if(str1.contains(str2)) {
			answer = 1;
		}
		return answer;
	}
}