package com.javaex.problem01;
import java.util.Scanner;
public class CalcApp {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Add add = new Add();
    	Div div = new Div();
    	Mul mul = new Mul();
    	Sub sub = new Sub();
    	//boolean t = true;
    	while(true) {
    		
    		System.out.print(">>");
    		String mix = sc.nextLine();
    		
    		if("/q".equals(mix)) {
    			System.out.println("종료");
    			break;
    			
    		}
    		int a = Integer.parseInt(mix.substring(0,1)); //이걸 탈출문 위에 써버리면 이 문장이 먼저 실행되어버려 "/q"입력시 파스인트에서 오류가 남
    		int b = Integer.parseInt(mix.substring(4,5));
    		//System.out.println(mix.charAt(2));
    		if(mix.charAt(2) == '+') {
    			System.out.println(">> " + add.calculate(a, b));
    			
    			//System.out.println(mix.charAt(2));
    			//t = false;
    		}
    		else if(mix.charAt(2) == '*') {
    			System.out.println(">> " + mul.calculate(a, b));  			
    		}
    		else if(mix.charAt(2) == '/') {
    			System.out.println(">> " + div.calculate(a, b));
    		}
    		else if(mix.charAt(2) == '-') {
    			System.out.println(">> " + sub.calculate(a, b));
    		}
    		else {
    			System.out.println("알 수 없는 연산입니다.");
    		}
    		
    		
    	}
    	
    }
}
