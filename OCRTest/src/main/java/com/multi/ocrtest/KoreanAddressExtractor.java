package com.multi.ocrtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KoreanAddressExtractor {

	public static void main(String[] args) {
		String address = "4:44 47 프랭크버거의왕포일점 X 16,800원 금액상세 V 거래일자 23.4.18· 12: 03:51 결제구분 일시불 결제카드 현대카드Z work 카드 소지자 본인 승인번호 00326389 승인상태 정상 경기 의왕시 포일세거리로 3, 1층 101호 (포일동,파 레사타워) 지도보기 031-000-0000 가맹점 상세 ^ 가맹점번호 163053334 대표자명 이정아 사업자등록번호 5951102083 업종 패스트푸드 ";
			
		//지번주소
		String regex = "(([가-힣]+(시|도)?|[서울]|[인천]|[대구]|[광주]|[부산]|[울산])( |))" //그룹1
				+ "([가-힣]+(시|군|구)( |))" //그룹5
				+ "(([가-힣]+(d|d(,|.)d|)+(로|읍|면|동|가|리)(\\d+)?(가)?)( |)?)"//그룹8
				+ "(\\d{1,4}-?\\d{1,4}( |)?)"; //그룹14
		
		String newRegex = "(([가-힣]+(시|도)?|[서울]|[인천]|[대구]|[광주]|[부산]|[울산])( |))" //그룹1
				+ "([가-힣]+(시|군|구)( |))" //그룹5
				+ "([가-힣]+(로|동|길)(\\d+)?(길|번길)?( |)?)" //그룹8,9,10
				+ "(\\d{1,4}( |)?)"
				+ "((-|~)?(\\d+)?( |)?)";
		
		Matcher matcher = Pattern.compile(regex).matcher(address);
		Matcher newMatcher = Pattern.compile(newRegex).matcher(address);
		if(matcher.find()) {
			System.out.println(matcher.group());	
		}
		else {
			System.out.println("안돼용~1");
		}
		if(newMatcher.find()){
			System.out.println(newMatcher.group());
		}
		else {
			System.out.println("안돼용~2");
		}
		
		
		//(([가-힣]+(d|d(,|.)d|)+(로))( |)?)|
	}
}
