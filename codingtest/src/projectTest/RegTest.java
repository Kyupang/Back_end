package projectTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {

	public static void main(String[] args) {
		
		String time = " 47 프랭크버거의왕포일점 × 16,800원 금액상세 V 거래일자 2023.04.18· 12: 03:51 결제구분 일시불 결제카드 현대카드Z work 카드 소지자 본인 승인번호 00326389 승인상태 정상 경기 의왕시 포일세거리로 3, 1층 101호 (포일동,파 레사타워) 지도보기 031-000-0000 가맹점 상세 ^ 가맹점번호 163053334 대표자명 이정아 사업자등록번호 5951102083 업종 패스트푸드";
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
				String phoneRegex = "(\\d{2,3}(-|\\))\\d{3,4}-\\d{4}( |)?)";
				
				
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
				//"[^0-9]", " "
				if (dateMatcher.find()) {
		            date = dateMatcher.group();
		            date = date.replaceAll("[^0-9]", " ");
		            date = date.replaceAll("\\s+", " ").trim();
		            
		            String[] dateParts = date.split("\\s+"); // Splitting the date into individual parts
					// Transforming the year
					String year = dateParts[0];
					if (year.length() == 4) {
						year = year.substring(2);
					}

					// Transforming the month
					String month = dateParts[1];
					if (month.startsWith("0")) {
						month = month.substring(1);
					}

					// Transforming the day
					String day = dateParts[2];
					if (day.startsWith("0")) {
						day = day.substring(1);
					}

					date = year + " " + month + " " + day;
					System.out.println(date);
		            
		        } else {
		            System.out.println("No match found.");
		        }
				if (timeMatcher.find()) {
		            time2 = timeMatcher.group();
		            time2 = time2.replaceAll("[^0-9]"," ");
		            time2 = time2.replaceAll("\\s+"," ").trim();
		            
		            String[] timeParts = time2.split("\\s+"); // Splitting the date into individual parts
		            String time3 = timeParts[0];
					if (time3.startsWith("0")) {
						time3 = time3.substring(1);
					}
		            
					String minute = timeParts[1];
					if (minute.startsWith("0")) {
						minute = minute.substring(1);
					}

					String second = timeParts[2];
					if (second.startsWith("0")) {
						second = second.substring(1);
					}

					time2 = time3 + " " + minute + " " + second;
					System.out.println(time2);
		        } else {
		            System.out.println("No match found.");
		        }
				if (phoneMatcher.find()) {
					System.out.println(phoneMatcher.group());
					phone = phoneMatcher.group();
				} else {
					phone = "안돼용~5";
				}
				

				result.add(jibun);
				result.add(doro);
				result.add(date);
				result.add(time2);
				result.add(phone);
				
				System.out.println(result);
	}

}
