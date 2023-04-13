package 배열;

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		Solution sol = new Solution();
		sol.solution(numbers);
		
	}

}
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        for(int i=0; i<numbers.length; i++) {
        	numbers[i] = numbers[i]*2;
        	
        }
        
        answer = numbers;
        return answer;
    }
}