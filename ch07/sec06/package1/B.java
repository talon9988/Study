package ch07.sec06.package1;

public class B { //A랑 같은 패키지
	//메소드 선언
	public void method() {
		A a = new A();		//o
		a.field = "value"; 	//o
		a.method(); 			//o
	}
}
