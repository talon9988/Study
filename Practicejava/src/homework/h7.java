package homework;

public class h7 {

	public static void main(String[] args) {
		int[] space = new int[45];
		for (int i = 0; i < space.length; i++) {
			space[i] = i + 1; //1부터 45까지
		}
		int[] sample = new int[6];

		int spaceSize = space.length; //45
		for (int i = 0; i < sample.length; i++) { 
			int random = (int) (Math.random() * (spaceSize - 1)); //0부터 44까지의 난수 45개 -> 인덱스 넘버
			sample[i] = space[random];
			space[random] = space[spaceSize - 1]; //사용한 난수를 인덱스 마지막 값으로 바꾼다
			spaceSize--;//인덱스를 줄인다> 마지막 인덱스를 없애서 마지막 넘버가 두개 뽑히지 않게 한다
		}

		for (int i = 0; i < sample.length; i++) {
			System.out.print(sample[i] + "\t");
		}
	}

} // 숙제: 숙제 제출 링크 https://forms.gle/vFC1cDHM21bdvqLs7