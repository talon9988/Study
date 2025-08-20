package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분"); //정수형 변수와 문자열 합치기도 가능

		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
	}
}
