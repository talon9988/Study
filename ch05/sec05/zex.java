package ch05.sec05;

public class zex {

	public static void main(String[] args) {
		int[] arr; //배열선언
		arr = new int[] {1,2,3}; //객체와 객체주소 할당됨, Heap 메모리에 배열 객체를 생성, 선언과 동시에 값저장해서 크기 설정하고 초기화
		int[] arr1 = {1,2,3,4}; //new int 안써도 알아서 컴파일러가 new int 쓴 것처럼 해줌
		int[] arr2 = new int[3]; //객체와 객체주소 할당됨, Heap 메모리에 배열 객체를 생성, 선언과동시에 길이도 선언, 보통 젤 많이 씀
		int[] arr3;
		arr3 = new int[3];
		int[] arr4; arr = new int[] {1,2,3};
	
	}

}
