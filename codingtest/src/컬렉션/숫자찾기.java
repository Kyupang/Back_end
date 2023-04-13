package 컬렉션;

import java.util.Arrays;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 29183;
		int k = 1;
		Solution sol = new Solution();
		sol.solution(num, k);
	}
	
	

}
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        String sk = Integer.toString(k);
        if(str.indexOf(sk) != -1) {
        	answer = str.indexOf(sk) +1;
        }else {
        	answer = -1;
        }
        
        return answer;
    }
}