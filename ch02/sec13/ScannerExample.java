package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine(); //문자열로 입력됨
		int x = Integer.parseInt(strX); //정수형으로 바꿈
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y; //정수
		System.out.println("x + y: " + result);
		System.out.println();

		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
	}
}

