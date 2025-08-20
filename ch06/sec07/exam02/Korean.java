package ch06.sec07.exam02;

public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;

	//생성자 선언
	public Korean(String name, String ssn) {
	  this.name = name;
	  this.ssn = ssn; //this는 클래스 자신을 가리킴
	}
	
	public Korean() { //source > generate using fields 로 빈 생성자 생성
		//super();
		
	}
	
	public Korean(String n) {
		name = n;
	}
}
