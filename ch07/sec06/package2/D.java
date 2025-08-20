package ch07.sec06.package2;

import ch07.sec06.package1.A; //다른 패키지 불러오기

public class D extends A { //A의 자식클래스
	//생성자 선언
	public D() { 
		//A() 생성자 호출
		super();					//o 부모 생성자 호출
	}
	
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "value"; 		//o 부모 필드 호출
		//A 메소드 호출
		this.method(); 			//o 부모 메서드 호출
	}
	
	//메소드 선언
	public void method2() { //프로텍티드의 범위 : 부모라고 해도 타 클래스에서의 객체 생성은 안됨
		//A a = new A();		//x
		//a.field = "value"; 		//x
		//a.method(); 			//x
	}	
}
