package ch06.sec14;

public class Car {
	//필드 선언 
	private int speed;
	private boolean stop;
	
	//speed 필드의 Getter/Setter 선언 -> 프라이빗 생성자의 값을 읽고 쓸 수 있다. 
	public int getSpeed() { //Getter: 값을 읽어옴
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed <= 0) {  //Setter: 값을 쓰게 해줌
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
			this.stop = false;
		}
	}

	//stop 필드의 Getter/Setter 선언
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}
