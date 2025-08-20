package poject;

public class MyBase extends mBase{

    //코드작성
	//부모클래스의 메서드를 오버라이드 하시오
	public void service(String state) {

        if (state.equals("낮")) {
            day();
        } else if(state.equals("밤")){
            night();
        }
        else {
        	afternoon();
        }
    }
	
	public void afternoon() {
        System.out.println("오후에도 열시미 일하자");
    }
}
