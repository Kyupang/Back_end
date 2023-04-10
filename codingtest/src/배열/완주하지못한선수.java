package 배열;

import java.util.Arrays;

public class 완주하지못한선수 {

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0;
        for(i=0; i< completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
        		break;
        	}
        }
        return participant[i];
    }
    
    public static void main(String[] args) {
		String[] a= {"leo", "kiki", "eden"};
		String[] b = {"eden", "kiki"};
		
    	System.out.println(solution(a,b));
	}
}
