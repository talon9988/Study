package ch05.sec08;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {		
		String[] strArray = new String[3]; //null로 초기화됨
		strArray[0] = "Java";              //null하고 빈문자는 다르다!!!!
		strArray[1] = "Java";
		strArray[2] = new String("Java"); //다른 새로운 갣체를 할당받음

		System.out.println( strArray[0] == strArray[1] );		//true: 같은 객체 참조
		System.out.println( strArray[0] == strArray[2] );    	//false: 다른 객체를 참조
		System.out.println( strArray[0].equals(strArray[2]) );	//true: 문자열이 (값은 동일)
	} 
}
