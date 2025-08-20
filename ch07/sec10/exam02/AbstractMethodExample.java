package ch07.sec10.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성
		animalSound(new Dog()); //객체 생성과 동시에 인자로 넘김
		animalSound(new Cat());
	}
	
	public static void animalSound( Animal animal  ) { //부모클래스는 추상이라 아무것도 못하고 자식클래스에서 부모클래스꺼를 받아서 알맞게 씀
		animal.sound();
		animal.breathe();
	}
}
