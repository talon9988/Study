package homework;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// Account RC = new Account();
		Account[] RC = new Account[100]; // 배열형태로 뭉탱이로 호출
		Scanner scanner = new Scanner(System.in);

		int cnt = 0;
		while (true) {
			RC[cnt] = new Account(); // 배열의 각 요소도 초기화 해줘야 함!!!!!!!!!!!!

			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			String input = scanner.nextLine();
			// c랑 똑같이 정수입력과 문자입력등 여러 자료형을 입력 받으면 엉뚱한 값이 변수에 저장될 수 있다.
			// 그래서 c의 gerchar();같이 잉여동작을 받아줄 문장을 써야됨
			if (input.equals("1")) {
				System.out.print("------\n계좌생성\n------\n");
				System.out.print("계좌번호: ");
				String accNum = scanner.nextLine();
				RC[cnt].setAccNum(accNum);
				
				System.out.print("계좌주: ");
				String name = scanner.nextLine();
				RC[cnt].setName(name);
				
				
				while (true) { //금액이 올바르게 입력됬는지 확인
					System.out.print("초기입금액: ");
					String firstInput = scanner.nextLine();
					int balance = Integer.parseInt(firstInput);
					RC[cnt].setBalance(balance);
					if (RC[cnt].getBalance() == 0) {
						System.out.println("입력볌위초과");
					}
					else break;
				}

				System.out.println("계좌생성완료");
				cnt++;
				// accNum, name, firstInput, balance: 계좌 생성
			} else if ("2".equals(input)) {
				System.out.println("------\n계좌목록\n------\n");
				for (int x = 0; x < cnt; x++) {
					String accNum = RC[x].getaccNum();
					System.out.print(accNum + "\t");

					String name = RC[x].getname();
					System.out.print(name + "\t");

					int getBalance = RC[x].getBalance();
					System.out.println(getBalance);
				}
				// getBalance: 계좌목록 상태조회
			} else if (input.equals("3")) {
				System.out.println("------\n예금\n------\n");
				System.out.println("계좌번호: ");
				String accNum = scanner.nextLine();

				System.out.println("예금액: ");
				String putNum = scanner.nextLine();
				int balance = Integer.parseInt(putNum);

				for (int x = 0; x < cnt; x++) {
					if (RC[x].getaccNum().equals(accNum)) {
						RC[x].setBalance(RC[x].getBalance() + balance);
						break;
					}
				}
				// putNum: 입금액
			} else if (input.equals("4")) {
				System.out.println("------\n출금\n------\n");
				System.out.println("계좌번호: ");
				String accNum = scanner.nextLine();

				System.out.println("출금액: ");
				String putNum = scanner.nextLine();
				int balance = Integer.parseInt(putNum);

				for (int x = 0; x < cnt; x++) {
					if (RC[x].getaccNum().equals(accNum)) {
						RC[x].setBalance(RC[x].getBalance() - balance);
					}
				}
				// putNum: 출금액
			} else if (input.equals("5")) {
				break;
			}

		}
		System.out.println("\n프로그램 종료");
	}
}
