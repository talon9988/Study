package ch05.sec05;

public class LengthExample {
	public static void main(String[] args) {
		String ssn = "7411111111111";
		int length = ssn.length();  //길이 
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
}

