package projectTest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {

	public static void main(String[] args) {
		
		String time = "경기도 의왕시 포일세거리로 23 안녕하세요23.4.18· 12: 03:51 이사람아!!! 070)5145-1235";
		//23.4.18· 12: 03:51
		//2023/04/21 12: 57
		//2023년 4월 20일 01:22
		//2023.03.05 거래시간 13:52:44
		
		// 지번주소
				String regex = "(([가-힣]+(시|도)?|[서울]|[인천]|[대구]|[광주]|[부산]|[울산])( |))" // 그룹1
						+ "([가-힣]+(시|군|구)( |))" // 그룹5
						+ "(([가-힣]+(d|d(,|.)d|)+(로|읍|면|동|가|리)(\\d+)?(가)?)( |)?)"// 그룹8
						+ "(\\d{1,4}-?\\d{1,4}( |)?)"; // 그룹14

				String newRegex = "(([가-힣]+(시|도)?|[서울]|[인천]|[대구]|[광주]|[부산]|[울산])( |))" // 그룹1
						+ "([가-힣]+(시|군|구)( |))" // 그룹5
						+ "([가-힣]+(로|동|길)(\\d+)?(길|번길)?( |)?)" // 그룹8,9,10
						+ "(\\d{1,4}( |)?)" + "((-|~)?(\\d+)?( |)?)";

				
				String dateRegex ="(\\d{2,4})(년|\\.|\\/)( |)?(\\d{1,2})(월|\\.|\\/)( |)?(\\d{1,2})((일)( |)?)?";
				String timeRegex = "(\\d{1,2})( |)?(\\:)( |)?(\\d{1,2})(( |)?(\\:)( |)?(\\d{1,2}))?";
				String phoneRegex = "(\\d{2,3}(-|\\))\\d{3,4}-\\d{4}$)";
				
				
				Matcher matcher = Pattern.compile(regex).matcher(time);
				Matcher newMatcher = Pattern.compile(newRegex).matcher(time);
				Matcher dateMatcher = Pattern.compile(dateRegex).matcher(time);
				Matcher timeMatcher = Pattern.compile(timeRegex).matcher(time);
				Matcher phoneMatcher = Pattern.compile(phoneRegex).matcher(time);
				
				
				
				
				List<String> result = new ArrayList<>();
				String jibun = "";
				String doro = "";
				String date ="";
				String time2 ="";
				String phone ="";
				
				if (matcher.find()) {
					System.out.println(matcher.group());
					jibun = matcher.group();
				} else {
					//System.out.println("안돼용~1");
					jibun = "안돼용~1";
				}
				if (newMatcher.find()) {
					System.out.println(newMatcher.group());
					doro = newMatcher.group();
				} else {
					//System.out.println("안돼용~2");
					doro = "안돼용~2";
				}
				if (dateMatcher.find()) {
		            date = dateMatcher.group();
		            System.out.println(date);
		        } else {
		            System.out.println("No match found.");
		        }
				if (timeMatcher.find()) {
		            time2 = timeMatcher.group();
		            System.out.println(time2);
		        } else {
		            System.out.println("No match found.");
		        }
				if (phoneMatcher.find()) {
					System.out.println(phoneMatcher.group());
					phone = phoneMatcher.group();
				} else {
					//System.out.println("안돼용~1");
					phone = "안돼용~1";
				}

				result.add(jibun);
				result.add(doro);
				result.add(date);
				result.add(time2);
				result.add(phone);
				
				System.out.println(result);
	}

}
