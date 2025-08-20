package ch12.sec05;

public class StringBuilderExample {
	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF") 
				.insert(0, "ABC") // 인덱스 0에 삽입
				.delete(3, 4) //D삭제
				.toString(); //최종 문자열로 변환(객체의 정보를 사람이 읽을 수 있는 문자열 형태로 반환)
		System.out.println(data);
	}
}
