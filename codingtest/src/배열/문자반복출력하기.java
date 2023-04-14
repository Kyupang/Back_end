package 배열;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int n=3;
		Sol2 sol = new Sol2();
		String result =sol.solution(my_string, n);
		System.out.println(result);
	}

}
class Sol2 {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        
        for(int i = 0; i<my_string.length(); i++) {
        	for(int j = 0; j<n ; j++) {
        		answer += str[i];
        	}
        }
        return answer;
    }
}