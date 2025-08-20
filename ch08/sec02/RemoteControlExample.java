package ch08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc; //인터페이스는 레퍼런스변수로 선언(객체로 선언x) - 추상메소드랑 똑같다.
		
		//rc 변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		
		//rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
	}
}



 