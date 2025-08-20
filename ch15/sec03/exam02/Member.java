package ch15.sec03.exam02;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age==age) ; //그런데 이름과 나이가 같으면 두개 객체는 같은거라고 보게 오버라이드 함
		} else {
			return false;
		}
	}	
}

