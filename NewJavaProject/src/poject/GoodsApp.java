package poject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	System.out.println("상품 3개를 입력해 주세요.");
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Goods> goods = new ArrayList<>();
    	int cnt = 0;
    	for (int i = 0; i < 3; i++) {
    	String info = sc.nextLine();
    	String[] s_info = info.split(" ");
    	int price = Integer.parseInt(s_info[1]);
    	int count = Integer.parseInt(s_info[2]);
    	goods.add(new Goods(s_info[0], price, count));
    	cnt += count;
    	}
    	;
    	for(Goods i:goods) {
    		i.show();
    	}
    	for(int i = 0; i < 3;i++) {
    		goods.get(i).show();
    	}
    	
    	Goods.ann(cnt); //스태틱 메소드를 이용하는법
    	goods.get(1).ann(cnt); //Goods타입의 리스트 하나를 불러와서 메서드를 호출하는법(리스트에 등록된 것들은 전부 타입이 Goods임)
    	System.out.println("총 상품의 갯수는 " + cnt + "개 입니다.");
    	
    }

}
