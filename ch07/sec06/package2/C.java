package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class C {
	//메소드 선언
	public void method() { //A의 필드 생성자 메소드는 프로텍티드 되어있다
		//A a = new A();		//x
		//a.field = "value"; 		//x
		//a.method(); 			//x
	}
}
