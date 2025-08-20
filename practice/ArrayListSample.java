package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

	public class ArrayListSample {
		
		public static void main(String[] args) {
			
			ArrayList<Integer> members = new ArrayList<>(); //<정수>만 담을 수 있는 배열
			
			ArrayList<Integer> members10 = new ArrayList<>(10); //초기 리스트 크기는 10, 나중에 리스트가 늘어날 때 10개씩 늘어남
			
			ArrayList<Integer> members3 = new ArrayList<>(Arrays.asList(1,2,3)); // 1, 2, 3 을 담아서 3개짜리의 리스트 만듦
		
			ArrayList<Integer> membersList = new ArrayList<>(members3); //위의 리스트 중 하나로 크기설정
			
			ArrayList<String> list = new ArrayList<>(10);
			list.add("a");
			list.add("b");
			list.add("c");
			list.add("d");
			list.add("e");
			list.add("f");
			list.size(); // 리스트의 사이즈는 6 (커페시티는 10개: 나중에 리스트가 늘어날 때 10갸씩 늘어남)
			
			System.out.println(list.get(3));
			 
			ArrayList<String> list2 = new ArrayList<>();
			list2.add("1");
		    list2.addAll(list); //list2에 list요소들을 넣는다
			 
			System.out.println(list2.get(0) + list2.get(1)); //1, a, b, c, d, e, f
			
			list2.add(3, "A"); //list2의 인덱스3에 삽입 //1, a, b, A, c, d, e, f
			//list2.add(100, "A") //배열처럼 벌레먹은 듯이 삽입 불가능(무조건 빈자리 없이 채워야 함)
			list2.add(8, "둥"); //경계 인덱스에 삽입 가능
			
			list2.remove(3);
			String result = list2.remove(0);
			System.out.println(result + "를 삭제함\nㅇㅇ");
			
			//if(list2.remove("둥")) {
				//System.out.println("삭제성공");
			//}
			
			//if(list2.removeAll(list)) {
				//System.out.println("success");
			//}
		//	list2.clear(); //빈 껍데기만 나옴
			
			int t = list2.lastIndexOf("둥"); //마지막에서 부터 찾음. 인덱스 번호 반환
			System.out.println(t + "번째");		
			
			boolean f = list2.isEmpty();
			boolean c = list2.contains("둥");
			
			System.out.println(f +","+ c);
			list2.set(6, "end"); //6번째 애의 값을 바꿈
			list2.ensureCapacity(3); //3씩 늘어남
			for(int i = 0; i < list2.size(); i++) {
				System.out.println(list2.get(i));
			}
			System.out.println();
			ArrayList<String> list4 = (ArrayList<String>)list2.clone();
			System.out.println(list4); //리스트는 된다
			
			System.out.println("0411");
			
			ArrayList list5 = new ArrayList(); //제네릭<> 안써도 됨. add할 때 리스트에 저장될값의 타임이 결정됨.
			list5.add(3);
			list5.add(2);
			list5.add(1);
			
			list5.sort(Comparator.naturalOrder()); //오름차순
			System.out.println(list5);
			
			list5.sort(Comparator.reverseOrder()); //내림차순
			System.out.println(list5);
			
			System.out.println("이터레이터"); //이터레이터: 순회
			Iterator iter =  list5.iterator();
			
			while(iter.hasNext()) { //hasnext는 다음리스트에 객체가 있는지 었는지 판단
				System.out.println(iter.next()); //next는 값을 빼옴
			}
			
			
		}
	}

