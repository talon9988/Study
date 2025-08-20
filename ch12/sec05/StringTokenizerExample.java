package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,"); //"&|,"는 & 또는 , 를 기준으로 나눈다는 뜻이야.
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();		
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/"); 
		// StringTokenizer는 문자열을 구분자로 분리할 수 있게 해주는 클래스로, 지정한 구분자(/)를 기준으로 문자열을 쪼개줘.
		//반복문으로 nextToken()을 호출하면서 각 토큰을 하나씩 꺼내서 처리해.
		while (st.hasMoreTokens()) { //StringTokenizer에 더 이상 꺼낼 토큰(token)이 남아 있는지를 확인하는 메서드야.
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}

