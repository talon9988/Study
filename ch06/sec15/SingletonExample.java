package ch06.sec15;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		Singleton obj1 = new Singleton();  //컴파일 에러
		Singleton obj2 = new Singleton();  //컴파일 에러
		
		static 키워드는 클래스(정적) 멤버를 선언할 때 사용되며,
		객체(instance)가 아니라 클래스 자체에 속하는 멤버를 의미합니다.
		즉, 클래스를 통해 직접 접근할 수 있고, 객체를 생성하지 않아도 사용 가능합니다.*/
		
		//정적 메소드를 호출해서 싱글톤 객체 얻기
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance(); //같은 필드를 받음
		
		//동일한 객체를 참조하는지 확인, 객체 주소값 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
