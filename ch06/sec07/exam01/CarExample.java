package ch06.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "검정", 250); //시그니처: ("그랜저", "검정", 250)
		//Car myCar = new Car();  //기본 생성자는 직접 만들지 않으면 없어서 호출 못함!!!
		
		Car myCar2 = new Car("검정", "소나타", 250);
		
		//Car myCar3 = new Car("검정", 250, "소나타"); //시그니처 순서 때문에 자료형이 달라서 안됨
	}
}

