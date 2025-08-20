package poject;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1464.70);
        //환율
        
        System.out.println(CConverter.toDoller(1000000) + "딸라");
        //백만원을 달러로 출력

        System.out.println(CConverter.toKRW(100) + "원");
        //100달러를 원으로 출력
        
        
    }

}
