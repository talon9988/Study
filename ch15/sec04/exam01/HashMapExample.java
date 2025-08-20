package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		//키는 스트링, 밸류는 인티저

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //put: 중복되었다면 밸류갚을 덮어써진다.
		System.out.println("총 Entry 수: " + map.size()); //엔트리(키, 벨류 쌍)
		System.out.println();

		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key); //홍길동인 키의 밸류를 반환
		System.out.println(key + ":: " + map.get("홍길동")); //키가 홍길동인 밸류 반환
		System.out.println();

		// 키 Set 컬렉션을 얻고, 반복해서 값 얻기
		Set<String> keySet = map.keySet(); //map.keySet(): 키 저장 / map.values(): 밸류값만 저장
		Iterator<String> keyIterator = keySet.iterator(); //이터레이터로 순회
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(key); //키에 해당하는 벨류를 반환
			System.out.println(k + " : " + v);
		}
		System.out.println();

		// 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		//엔드리셋: 키-밸류쌍을 꺼냄
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator(); //이터레이터로 순회함
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();

		// 키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
	}
}
