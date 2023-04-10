package 문자열;

public class 스트링다루는법 {

	public static void main(String[] args) {
		String s = "나는 프로그래머프야";
		String s2 = "진짜!!";
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0)); //0번에 뭐가있니?
		System.out.println(s.endsWith("야")); //야로 끝나니?
		System.out.println(s.substring(3)); //3번부터 내놔라~?
		System.out.println(s.substring(3,8));
		
		String result = s+s2;
		System.out.println(result.contains(s2));
		
		System.out.println(s.lastIndexOf("프")); //s중 프 글자 위치
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.length());
		System.out.println(s.replace("나", "너"));
	}

}
