package homework;
import java.util.Scanner;
public class h4 {
	//문자로 숫자 받은다음 인티저.파스인트로 문자를 숫자로 변환
	public static void main(String[] args) {
		char[] c = {'T','h','i','s',' ','i','s',' ','a',' ','J','a','v','a'};
		
		for(int i = 0; i < c.length;i++) {
			if(' ' == c[i]) {
				c[i] = ',';
			}
		}
		for(int i = 0; i < c.length;i++)
			System.out.print(c[i]);
		
		for(int tmp:c) {
		if(tmp == ' ') {
			tmp = ',';
		}
	}
	}
	
}