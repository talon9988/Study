package ch12.sec04;

public class InExample {
	public static void main(String[] args) throws Exception {
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			 //Enter 키를 읽지 않았을 경우에만 실행
			if(keyCode != 13 && keyCode != 10) {	//엔터키의 아스키코드			
				if (keyCode == 49) { 			//숫자 1 키를 읽었을 경우, '1'의 아스키코드49
					speed++;
				} else if (keyCode == 50) { 	//숫자 2 키를 읽었을 경우
					speed--;
				} else if (keyCode == 51) { 	//숫자 3 키를 읽었을 경우
					break;
				}
				System.out.println("-----------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-----------------------------");
				System.out.println("현재 속도=" + speed);
				System.out.print("선택: ");
			}
			
			//키를 하나씩 읽음
			keyCode = System.in.read();
			/* System.in.read()란?
				System.in은 표준 입력 스트림 (keyboard 입력) 을 의미합니다.
				read()는 입력 스트림에서 하나의 바이트를 읽어서 int로 반환합니다.
				이 메서드는 사용자가 키보드를 눌렀을 때 그 키의 ASCII 코드 값을 정수형으로 읽어옵니다.
				예를 들어:
				'1'을 누르면 → ASCII 코드 49
				'2' → 50
				'3' → 51
				Enter 키 → 13(CR, Carriage Return) 또는 10(LF, Line Feed)
			 	*/
		}	
		
		System.out.println("프로그램 종료");
	}
}
 