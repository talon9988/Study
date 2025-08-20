package poject;
import java.util.Scanner;
public class FriendApp {
    public static void main(String[] args) {
        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("친구를 3명 등록해 주세요");
        
        //String input;
        
        for(int i = 0; i < 3;i++) {
        	friendArray[i] = new Friend(); //생성자 주의!!!!!
        	String input = sc.nextLine();
        	String[] info = input.split(" "); //배열크기 알아서 초기화됨. 짱신기함.
        	friendArray[i].setter(info[0], info[1], info[2]);
        }
        
        for(int i = 0; i < 3;i++) {
        	friendArray[i].showInfo();
        }
        
            // 친구정보 입력받기
            // 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
            // Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
            // 배열에 추가하기 ( friendArray <- friend객체 )
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        }
        sc.close();
    }
}
