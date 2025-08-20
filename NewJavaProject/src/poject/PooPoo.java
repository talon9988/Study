package poject;

public class PooPoo {

	private int x, y, z; //프라이빗 필드 때문에 스태틱을 선언하면 오류가 마니마니 생김

	public PooPoo() {
	}
	public PooPoo(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void setXYZ(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() { 
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
	
	public void build() {
		for(int i = 1; i <= this.x; i++) {
			System.out.print(" ");
		}
		//System.out.println();
		for(int i = 1; i <= this.y; i++) {
			System.out.print("*");
		}
		//System.out.println();
		for(int i = 1; i <= this.z; i++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	
}
/*4 1 4
3 3 3
2 5 2
1 7 1
0 9 0*/