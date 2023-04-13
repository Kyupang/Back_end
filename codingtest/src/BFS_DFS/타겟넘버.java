package BFS_DFS;

public class 타겟넘버 {
	
	public static void main(String[] args) {
		int[] a = {1,1,1,1,1};
		int target =3;
		
		Solution sol = new Solution();
		int answer = sol.solution(a, target);
		System.out.println(answer);
		
	}

}

class Solution {
	int answer;
	int[]numbers;
	int target;
	
	void dfs(int index, int sum) {
    	//1. 종료조건
    	if(index == numbers.length) {
    		if(sum == target) answer++;
    		return;
    	}
    	
    	//2. 수행동작
    	dfs(index+1,sum+numbers[index]);
    	dfs(index+1,sum-numbers[index]);
    }
	
	public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;
        
        dfs(0,0);
        return answer;
    }
    
    
}
