package ch12.sec03.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) { //equals는 원래 주소를 비교하는데 내용을 비교하도록 재정의 함
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
}
