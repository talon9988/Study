package ch08.sec03;

public interface RemoteControl {
	//상수 필드
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void powerOn();
	void volume(boolean b);
	void channel(boolean b);
	void channel(int c);
}

