package poject;

public class Print {
    
    public void printer(int val){
        System.out.println(val);
    }

    public void printer(boolean val){
        System.out.println(val);
    }
    public void printer(double val){
        System.out.println(val);
    }
    public void printer(String val){
        System.out.println(val);
    }
    public void printer(String val, String val_2){ //매개변수의 개수가 달라도 메서드 오버로딩
        System.out.println(val);
    }
    //이것이 메소드 오버로드 라는 것이다.
    /*같은 이름의 메소드를 매개변수의 개수나 타입을 다르게 하여 여러 개 정의하는 것을 의미해.
    1. 메소드 이름이 동일해야 함
    2. 매개변수의 개수 또는 타입이 달라야 함 (반환 타입만 다르게 하면 오버로딩이 성립되지 않음)
    3. 같은 클래스 내에서 정의됨*/
    
}
