package ch06.sec12.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import ch06.sec12.hankook.SnowTire; //한국패키지의 스노타이어 클래스 불러옴
import ch06.sec12.kumho.AllSeasonTire; //금호 패키지의 올시즌타이어 클래스 불러오기

public class Car {
	//부품 필드 선언
	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire(); //외부 패키지의 클래스 불러와서 객체선언
	SnowTire tire11 = new SnowTire(); //이 외부클래스는 위에 임포트문으로 외부 패키지불러와서 객체 선언시 패키지명까지 안써도됨
	
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
	/*public static void main(String[] args) {
	SnowTire tire11 = new SnowTire(); //접근제한자 퍼블릭: 다른 패키지 내에서도 이 메소드를 쓸 수 있게 함
	tire11.help();
	
	}*/ // 퍼블릭 메소드
}


