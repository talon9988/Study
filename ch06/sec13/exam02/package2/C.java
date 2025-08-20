package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.*;

public class C {
	// 필드 선언
	A a1 = new A(true);			//o
	//A a2 = new A(1);				//x 디폴트 생성자 - 같은 패키지 내에서만 생성자를 호출할 수 있다
	//A a3 = new A("문자열");		//x 프라이빗 생성자
}
