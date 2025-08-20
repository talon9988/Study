package poject;

public class mBase {

    public void service(String state) {

        if (state.equals("낮")) {
            day();
        } else {
            night();
        }
    }

    public void day() {
        System.out.println("낮에는 열시미 일하자");
    }

    public void night() {
        System.out.println("night에는 잠을 자자");
    }
}
