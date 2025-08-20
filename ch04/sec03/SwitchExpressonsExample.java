package ch04.sec03;

public class SwitchExpressonsExample {
	public static void main(String[] args) {
		char grade1 = 'B', grade2 = 'A';
		
		switch(grade1) {
			case 'A', 'a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}						
			default -> {
				System.out.println("손님입니다.");
			}
		}

		switch(grade2) {
			case 'A', 'a' -> System.out.println("우수 회원입니다.");
			case 'B', 'b' -> System.out.println("일반 회원입니다.");						
			default -> System.out.println("손님입니다.");
		}
	}
}
