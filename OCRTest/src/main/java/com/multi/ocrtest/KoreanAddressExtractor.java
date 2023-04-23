package com.multi.ocrtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KoreanAddressExtractor {

	public static void main(String[] args) {
		String address = "경기도 안양시 종로5가 5-1";
			
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
