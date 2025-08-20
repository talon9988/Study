package homework;
 //썃호떡, 슈붕 추가
public class Hunger2_exe {
	public static void main(String[] args) {
		int pb = 700, sb = 1000, hb = 700, cb = 900;
		Fishbread[] fb = new Fishbread[6]; //배열처럼 선언해서 이 클래스를 6번 호출하도록(객체를 6번 생서하도록)함
		for(int i = 0; i < 3;i++) {
			fb[i] = new Fishbread("팥붕", pb);
		}
		for(int i = 3; i < 6;i++) {
			fb[i] = new Fishbread("슈붕", sb);
		}
		
		hotCake[] hob = new hotCake[6];
		for(int i = 0; i < 3;i++) {
			hob[i] = new hotCake("호떡", hb);
		}
		for(int i = 3; i < 6;i++) {
			hob[i] = new hotCake("썃호떡", cb);
		}
		
		
		int pbprice = 0, sbprice = 0;
		for(int k = 0; k < fb.length;k++) {
			if(k < 3)
				pbprice += fb[k].tt();
			else
				sbprice += fb[k].tt();
			
		}
		int hbprice = 0, cbprice = 0;
		for(int k = 0; k < hob.length;k++) {
			if(k < 3)
				hbprice += hob[k].tt();
			else
				cbprice += hob[k].tt();
			
		}
		//System.out.println("팥붕" + pbprice + "원");
		//System.out.println("슈붕" + sbprice + "원");	
		//System.out.println("호떡" + hbprice + "원");	
		//System.out.println("썃호떡" + cbprice + "원");	
		
		Hunger tot = new Hunger(pbprice, sbprice, hbprice, cbprice);
		System.out.println("종 " + tot.ret() + "원");
		
	}
}
