package ch11.sec04;

public class MyResource implements AutoCloseable {
	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("[MyResource(" + name + ") 열기]");
	}
	
	public String read1() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "abc";
	}
	
	@Override
	public void close() throws Exception { //try에서 예외가 발생하면 강제로 닫는 부모의 메서드를 호출(그 부모에 그 자식)
		System.out.println("[MyResource(" + name + ") 닫기]");
	}
}
