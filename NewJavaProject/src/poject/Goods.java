package poject;

public class Goods {

    private String name;
    private int price;
    private int count;
	public Goods(String name, int price, int count) {

		this.name = name;
		this.price = price;
		this.count = count;
	}
	
    public void show() {
    	System.out.println(this.name +"(가격:" + this.price + "원)이 " + this.count + "개 입고됨.");
    }
    
    public static void ann(int cnt) {
    	System.out.println("총 상품의 갯수는 " + cnt + "개 입니다.");
    }
}
