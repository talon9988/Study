package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		//Week 열거 타입 변수 선언
		Week today = null;
		
		//Calendar 얻기
		Calendar cal = Calendar.getInstance(); //calendar객체에서 getInstance를 통해 오늘날짜를 반환함
		//Calendar는 자바에서 제공하는 날짜·시간 관리 클래스입니다.
        //Calendar.getInstance()를 사용하여 현재 날짜와 시간을 얻을 수 있습니다.
		
		//오늘의 요일 얻기(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK); //cal.get: 자바에서 제공하는 함수. Calendar 객체에 저장된 날짜와 시간의 특정 값을 읽어오기 위한 메서드
		//오늘 날짜의 요일에 해당하는 값을 반환(Calendar.DAY_OF_WEEK)
		
		//숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
			case 1:  today = Week.SUNDAY ;        	break;
			case 2:  today = Week.MONDAY;       	break;
			case 3:  today = Week.TUESDAY;       	break;
			case 4:  today = Week.WEDNESDAY; 		break;
			case 5:  today = Week.THURSDAY;   		break;
			case 6:  today = Week.FRIDAY;         	break;				
			case 7:  today = Week.SATURDAY;   		break;		
		}
		
		//열거 타입 변수를 사용
		if(today == Week.SUNDAY || today == Week.SATURDAY) {
			System.out.println("일요일에는 축구를 합니다." + today +" " + week);
		} else {
			System.out.println("열심히 자바 공부합니다." + today +" " + week);
		}
	}
}
