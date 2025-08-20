package ch05.sec03;

public class ReferenceVariableCompareExample2 {
	public static void main(String[] args) {
		int[] arr1; 		//배열 변수 arr1 선언
		int[] arr2;		 	//배열 변수 arr2 선언
		int[] arr3; 		//배열 변수 arr3 선언
		
		arr1 = new int[] { 1, 2, 3 }; 	//배열객체 할당: 배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
		arr2 = new int[] { 1, 2, 3 }; 	//배열 { 1, 2, 3 }을 생성하고 arr2 변수에 대입
		//arr3 = arr2; 
		arr2 = arr1;
		arr3 = arr2; //모두 arr1주소와 같아짐
		
		//배열 변수는 객체(포인터)이다. arr3과 arr2가 가리키는 객체의 주소는 같다.						//배열 변수 arr2의 값을 배열 변수 arr3에 대입
		//arr1과 arr2는 각각 new를 써서 새로만든 서로 다른 객체다.
		System.out.println(arr1 == arr2); 	//arr1과 arr2 변수 값이 동일한 번지인지 검사
		System.out.println(arr2 == arr3);	//arr2와 arr3 변수가 같은 배열을 참조하는지 검사
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3); //배열 주소 출력됨
	}
}



