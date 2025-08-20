package ch11.sec04;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (MyResource res = new MyResource("A")) { //열기
			String data = res.read1(); //읽기
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage()); //부모의 메서드
		}
		
		System.out.println();
		
		try (MyResource res = new MyResource("A")) {
			String data = res.read2();
			//NumberFormatException 발생
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		/*try (
			MyResource res1 = new MyResource("A"); 
			MyResource res2 = new MyResource("B")
		) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}*/
		
		MyResource res1 = new MyResource("A"); //열기
		MyResource res2 = new MyResource("B");//열기
		try (res1; res2) { //여러개의 객체를 동시에 트라이
			String data1 = res1.read1(); //읽기
			String data2 = res2.read1(); //읽기
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
}

