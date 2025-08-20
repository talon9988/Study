package ch15.sec03.exam02;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성 - 해쉬코드(주소)를 이용하여 중복체크함
		Set<Member> set = new HashSet<Member>(); //해쉬코드가 같으면 같은걸로 본다
		
		//Member 객체 저장
		set.add(new Member("홍길동", 30)); //new를 써서 다른 객체를 넣음. 해쉬코드가 다르다
		set.add(new Member("홍길동", 30));
		
		//저장된 객체수 출력
		System.out.println("총 객체수 : " + set.size()); //1개나옴
	}
}

