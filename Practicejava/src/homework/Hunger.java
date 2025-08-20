package homework;

public class Hunger {
	
	int f, s,h,c;
	Hunger(int fb, int sb, int hb, int cb){
		f = fb;
		s = sb;
		h = hb;
		c = cb;
	}
	int ret() {
		int sum = f + h + s + c;
		//System.out.println("total" + sum);
		return sum;
	}
}
class Fishbread{
	/*int pprice, sprice;
	String fishcake;
	Fishbread(String fb, int price){
		fishcake = fb; 
		if("팥붕".equals(fb))
			this.pprice = price;
		else if("슈붕".equals(fb))
		this.sprice = price;
	}
	
	int tt () {
		if("팥붕".equals(fishcake))
			return pprice;
		return sprice;
	}*/
	int price;
	Fishbread(String fb, int price){
		this.price = price;}
	int tt () {
		return this.price;
	}
}
class hotCake{
	/*int price, cprice;
	String hotcake;
	hotCake(String hb, int price) {
		hotcake = hb;
		if("호떡".equals(hb))
			this.price = price;
		else if("썃호떡".equals(hb))
		this.cprice = price;
		
	}
	int tt () {
		if("호떡".equals(hotcake))
			return price;
		return cprice;
	}*/
	int price;
	hotCake(String hb, int price){
		this.price = price;}
	int tt () {
		return this.price;
	}
}