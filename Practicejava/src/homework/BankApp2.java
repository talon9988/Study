package homework;
//업그레이드 버전
import java.util.Scanner;

public class BankApp2 {

	public static void main(String[] args) {
		// Account RC = new Account();
		Account2[] RC = new Account2[100]; // 배열형태로 뭉탱이로 호출
		Scanner scanner = new Scanner(System.in);

		int cnt = 0, tmp = 0;
		boolean c = true;
		while (c == true) {
			RC[cnt] = new Account2(); // 배열의 각 요소도 초기화 해줘야 함!!!!!!!!!!!!
			tmp = 0;
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			String input = scanner.nextLine();
			// c랑 똑같이 정수입력과 문자입력등 여러 자료형을 입력 받으면 엉뚱한 값이 변수에 저장될 수 있다.
			// 그래서 c의 gerchar();같이 잉여동작을 받아줄 문장을 써야됨
			switch(input) {
			case "1":
				if(cnt > 99) {
					System.out.println("꽉참");
					c = false;
				}
				System.out.print("------\n계좌생성\n------\n");
				System.out.print("계좌번호: ");
				String accNum = scanner.nextLine();
				RC[cnt].setAccNum(accNum);
				
				System.out.print("계좌주: ");
				String name = scanner.nextLine();
				RC[cnt].setName(name);
				
				boolean t = true;
				while (t == true) { //금액이 올바르게 입력됬는지 확인
					System.out.print("초기입금액: ");
					String firstInput = scanner.nextLine();
					int balance = Integer.parseInt(firstInput);
					RC[cnt].setBalance(balance);
					if (RC[cnt].getBalance() == 0) {
						System.out.println("입력범위초과");
					}
					else t = false;
				}

				System.out.println("계좌생성완료");
				cnt++;
				break;
				// accNum, name, firstInput, balance: 계좌 생성
			case "2": 
				System.out.println("------\n계좌목록\n------\n");
				for (int x = 0; x < cnt; x++) {
					String accNum2 = RC[x].getaccNum();
					System.out.print(accNum2 + "\t");

					String name2 = RC[x].getname();
					System.out.print(name2 + "\t");

					int getBalance = RC[x].getBalance();
					System.out.println(getBalance);
				}
				break;
				// getBalance: 계좌목록 상태조회
			case "3":
				System.out.println("------\n예금\n------\n");
				System.out.println("계좌번호: ");
				String accNum3 = scanner.nextLine();
				
				System.out.println("예금액: ");
				String putNum = scanner.nextLine();
				
				int balance = Integer.parseInt(putNum);
				if(balance <= 0) {
					System.out.println("값 틀렸어 짜샤");
					continue;
				}

				for (int x = 0; x < cnt; x++) {
					if (RC[x].getaccNum().equals(accNum3)) {
						tmp = RC[x].getBalance();	
						//System.out.println(tmp);	
						
						RC[x].deposit(balance);
						//tmp = RC[x].getBalance();	
						//System.out.println(tmp);
						if(tmp == RC[x].getBalance()) {
							System.out.println("오류-한도초과");	
						}
						else System.out.println("예금 완료");
						break;
					}
					
				}
				break;
				// putNum: 입금액
			case "4":
				System.out.println("------\n출금\n------\n");
				System.out.println("계좌번호: ");
				String accNum1 = scanner.nextLine();

				System.out.println("출금액: ");
				String putNum4 = scanner.nextLine();
				int balance4 = Integer.parseInt(putNum4);
				if(balance4 <= 0) {
					System.out.println("값 틀렸어 짜샤");
					continue;
				}

				for (int x = 0; x < cnt; x++) {
					if (RC[x].getaccNum().equals(accNum1)) {	
						
						tmp = RC[x].withdraw(balance4);
						//System.out.println(tmp);
						//System.out.println(RC[x].getBalance());
						if(tmp == 0)System.out.println("오류-한도 초과");
						else System.out.println("출금 완료");
					}
				}
				break;
				// putNum: 출금액
			case "5":
				System.out.println("프로그램 종료");
				c = false;
				break;
			}

		}
	}
}
