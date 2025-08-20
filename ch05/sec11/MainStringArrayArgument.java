package ch05.sec11;

public class MainStringArrayArgument {
	public static void main(String[] args) { //메인 메소드의 인자값은 스트링 배열이다 
		if(args.length != 2) {
			System.out.println("프로그램 입력 값이 부족");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
//실행시에 메인메소드에 인자값 전달 run confuguration
//tring[] args**는 프로그램 실행 시 명령행에서 입력된 인자값들을 받을 수 있는 배열입니다.
//예를 들어, java MainStringArrayArgument 10 20와 같이 실행하면, args[0] = "10", args[1] = "20"이 됩니다.