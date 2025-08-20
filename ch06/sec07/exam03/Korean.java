package ch06.sec07.exam03;

public class Korean {
	// 필드 선언
	String nation = "대한민국";
	String name = "ㅇㅇ";
	String ssn = "ㅇㅇㅇㅇ";

	// 생성자 선언
	public Korean(String n, String s) {
		name = n;
		ssn = s;
	}
	
	public Korean() {
		//this.name = "병신";
		this.ssn = "ㅋ";
	}
}
