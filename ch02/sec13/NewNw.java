package ch02.sec13;

import java.util.Scanner; //Scanner은 기본적으로 제공하는 클래스가 아님(include 헤더파일 추가작업같이 패키지를 추가해야함)

public class NewNw {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //문자열 포인터 생성 -> 문자열 객체를 생성
		//System.in: 키보드와 연결
		String inputdata = scanner.nextLine(); //입력할 때 까지 기다림
		
		System.out.println("입력한 내용:" + inputdata);
		scanner.close(); // 스캐너가 계속 입력없이 대기중일 때의 메모리 누수를 방지
	}

}
