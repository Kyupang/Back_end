package 문자열;

public class 스트링에서캐릭터배열에옮기기 {

	public static void main(String[] args) {
		String ss = "s205621"; //String도 index를 이용해서 추출가능 
		char c = ss.charAt(0);
		String answer = "개발부서가 아닙니다.";
		if(c == 's') {
			answer = "개발부서입니다.";
		}
		System.out.println(answer);
		
		char bb = ss.charAt(ss.length()-1);
		
		String a = ss.substring(1,4);
		System.out.println(a);
		String[] a1 = ss.split("");
		System.out.println(a1[1]+a1[2]+a1[3]);
	}

}
