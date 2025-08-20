package ch05.sec05;

public class SplitExample {
	public static void main(String[] args) {
		String board = "1,자바학습 참조타입, String을 학습합니다.,홍길동";
		
		//문자열 분리 콤마를 기준으로 
		String[] arr = board.split(",");
		
		//인덱스별로 읽기
		System.out.println("번호: " + arr[0]);
		System.out.println("제목: " + arr[1]);
		System.out.println("내용: " + arr[2]);
		System.out.println("쓴이: " + arr[3]);
		//System.out.println("범위밖: " + arr[4]); //out of range
		System.out.println();
		
		//for문을 이용한 읽기
		//arr은 문자열이 저장된 2차원 배열 같은거다.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].charAt(0));
			//System.out.println(arr[i].charAt(1));
		}
	}
}

