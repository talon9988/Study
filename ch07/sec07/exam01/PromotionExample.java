package ch07.sec07.exam01;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {
	public static void main(String[] args) { //트리구조(촌수와 직계자손 관계도)에 따라 메소드 형변환이 됨
		B b = new B(); 
		C c = new C();
		D d = new D(); 
		E e = new E();

		A a1 = b; //b는 A로 형변환 - 엄마꺼로 형변환
		A a2 = c; //c는 A로 형변환 - 엄마꺼로 형변환 
		A a3 = d; //B가 A와 이어짐(A의 자식) : D > B > A : d는 A로 형변환 - 할머니꺼로 형변환
		A a4 = e; //C가 A와 이어짐(A의 자식) : E > C > A : e는 A로 형변환 - 할머니꺼로 형변환

		B b1 = d; //엄마꺼로 형변환
		C c1 = e; //엄마꺼로 형변환

		// B b3 = e; //B와 E는 촌수가 같기 때문에 안됨 : 형제는 남이다.
		// C c2 = d; //D는 C의 직계후손이 아니다. 
	}
}
