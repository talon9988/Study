package ch15.sec02.exam02;
//멀티스레드: 작업을 여러개로 쪼개서 하는 것 
//벡터는 멀티스레드 용이다
//동기화된 메소드로 구성되어있어 동시에 벡터 메소드를 실행할 수 없음
//멀티스레드 환경에서는 안전하게 객체를 추가 또는 삭제할 수 있음
import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		//Vector 컬렉션 생성
		List<Board> list = new Vector<>(); //벡터개체를 리스트에다 담음
	
		//작업 스레드 객체 생성
		Thread threadA = new Thread() { //스레드 2개 선언
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//작업 스레드 객체 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1001; i<=2000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될때까지 메인 스레드를 기다리게함
		try { //반드시 트라이캐치로 묶어야 함
			threadA.join();
			threadB.join();
		} catch(Exception e) {
		}
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수: " + size);		
		System.out.println();	
		
		//동시에 벡터메소드를 실행할 수 없다
		for(Board b:list) {
		System.out.println(b.getSubject());	
		}
	}
}


