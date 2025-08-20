package ch12.sec09;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(); //현재 시스템의 날짜와 시간을 LocalDateTime 객체로 가져옵니다.
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss"); //출력 포맷을 지정
		System.out.println("현재시간: " + now.format(dtf));
		
		LocalDateTime  result1 = now.plusYears(1);
		System.out.println("1년 덧셈: " + result1.format(dtf));
		//format(dtf)는 LocalDateTime 객체를 사람이 읽을 수 있는 문자열로 변환하는 메서드예요.	
		LocalDateTime  result2 = now.minusMonths(2);
		System.out.println("2달 뺄셈: " + result2.format(dtf));
		
		LocalDateTime  result3 = now.plusDays(7);
		System.out.println("7일 덧셈: " + result3.format(dtf));
	}
}

