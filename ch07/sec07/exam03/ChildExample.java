package ch07.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		//객체 생성 및 자동 타입 변환
		Parent parent = new Child();//자식클래스의 부모화 - 업캐스팅
		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2";      		//자식꺼 쓰기(불가능) -Parent 타입으로는 Child 클래스에 정의된 멤버에 접근할 수 없음
		parent.method3();         		//자식꺼 쓰기(불가능)
		*/
		
		//강제 타입 변환
		Child child = (Child) parent; //부모 클래스의 자식화-강제형변환
		
		//Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";  			//(가능-부모가 자식화됨. 자식꺼 쓸 수 있음) 부모클래스가 Child 타입으로 형변환되었기 때문에 Child에만 있는 필드/메서드도 사용 가능함.
		child.method3();     			//(가능) - 원래 부모는 자식꺼 쓸 수 없음. Parent 타입 참조일 때는 Child 고유 멤버에 접근 불가했지만, 지금은 Child로 참조 중이라 가능.
	}
}
