package ch06.sec04;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); //기본생성자 Student() 를 이용해 객체 생성후 초기화
		//클래스 변수이름 = 객체생성키워드 생성자; 생성자는 일반적으로 클래스 명과 이름이 독같다. new키워드 붙여서 호출 할 수 있는 메서드는 생성자 밖에 없다.
		//s1은 스튜던트 객체이다.
		//객체가 선언될 때 jvm이 생성자를 통해 클래스의 필드값을 초기화 함
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}
