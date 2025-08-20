package ch02.sec12;

import java.util.Scanner;

public class PrintfExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String str = scanner.nextLine();
		System.out.print("값: ");
		int value = Integer.parseInt(scanner.nextLine()); //문자열 값을 입력받은다음 정수로 변환
		System.out.printf("상품의 가격:%d원\n", value); //123원(개행)
		System.out.printf("상품의 가격:%6d원\n", value); //___123원(개행)
		System.out.printf("상품의 가격:%-6d원\n", value); //123___원(개행)
		System.out.printf("상품의 가격:%06d원\n", value); //000123원(개행)

		double area = 3.14159 * 10 * 10; //314.159
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area); //____314.16(개행) //잘리는 소수자릿수는 반올림함314.159 > 314.16

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job); //_____1 | 홍길동_______ | ________도적
		System.out.println("zzzzzz");
		System.out.println("ㅋㅋㅋㅋㅋㅋ");
		System.out.println();
	}
}	
