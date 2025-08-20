package poject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
//슨생님꺼
public class ArrayListSample {

  public static void main(String[] args) {
    // 타입설정 Integer 객체만 적재가능
    ArrayList<Integer> members = new ArrayList<>();
    
    // 초기 용량(capacity)지정
    ArrayList<Integer> num3 = new ArrayList<>(10);

    // 배열을 넣어 생성
    ArrayList<Integer> list22 = new ArrayList<>(Arrays.asList(1,2,3));

    // 다른 컬렉션으로부터 그대로 요소를 받아와 생성 
    // (ArrayList를 인자로 받는 API를 사용하기 위해서 Collection 타입 변환이 필요할 때 많이 사용)
    ArrayList<Integer> list3 = new ArrayList<>(list22);
    
    
    
    
    
    ArrayList<String> list = new ArrayList<>(10); // 용량(capacity)를 10으로 설정

    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add("F");

    list.size(); // 크기(size)는 6 (들어있는 요소의 총 개수)
    System.out.println( list.size() );
    System.out.println( list.get(3) );
    
    
    
    
    
    
    ArrayList<String> list1 = new ArrayList<>();
    list1.add("1");
    list1.add("2");

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("3");
    list2.add("4");

    list1.addAll(list2); // list1에 list2의 내용을 추가한다.
     
    System.out.println(list1); // [1, 2, 3, 4]
    System.out.println(list2);
    
    
    
    
    ArrayList<String> list5 = new ArrayList<>(8); 

    list5.add("1");
    list5.add("2");
    list5.add("3");
  //list5.add("A"); 
    list5.add("4");
    list5.add("5");

    // 3번째 인덱스 자리에 요소 삽입
    list5.add(3, "A");

    System.out.println(list5); // [1, 2, 3, A, 4, 5]
    
    list5.add(6, "B");
    
    System.out.println(list5); // [1, 2, 3, A, 4, 5]
    
    String result = list5.remove(3);
    System.out.println("list5 에서 " + result + "를 삭제 했습니다 결과는 " + list5 );
    
    if(list5.remove("B")) {
      System.out.println("list5 에서 \"B\" 삭제 성공");
    }
    System.out.println(list5);
    
    //list5.clear();
    System.out.println(list5.isEmpty());
    
    System.out.println(list5.indexOf("2"));
    
    System.out.println(list5.lastIndexOf("2"));
    
    
    
    
    
    
    
    
    
    
    
    
    
    ArrayList<String> list6 = new ArrayList<>(18); 

    list6.add("P");
    list6.add("r");
    list6.add("o");
    list6.add("g");
    list6.add("r");
    list6.add("a");
    list6.add("m");

    // list[0] ~ list[6] 범위 반환
    list6.subList(0, 7); // [P, r, o, g, r, a, m]

    // list[3] ~ list[6] 범위 반환
    list6.subList(3, 7); // [g, r, a, m]

    // list[3] ~ list[5] 범위 반환
    list6.subList(3, 6); // [g, r, a]
    
    list6.set(6, "n");
    
    System.out.println(list6);
    
    
    ArrayList<String> list7 = new ArrayList<>(10); // 용량(capacity)를 10으로 설정

     // 용량 10을 넘은 요소 13개 추가
     list7.add("A");
     list7.add("B");
     list7.add("C");
     list7.add("D");
     list7.add("E");
     list7.add("F");
     list7.add("G");
     list7.add("H");
     list7.add("I");
     list7.add("J");
     list.ensureCapacity(5);
     list7.add("K");
     list7.add("L");
     list7.add("M");
    
     System.out.println( list7.size() ); // 크기(size)는 13 : 자동으로 용량이 증가되어 데이터를 적재함
     System.out.println( list7 );
     
     
     
     ArrayList<Integer> number = new ArrayList<>();
     number.add(1);
     number.add(3);
     number.add(5);

     // ArrayList는 내부적으로 Object[] 배열로 저장하기 때문에 형변환이 필요함
     ArrayList<Integer> cloneNumber = (ArrayList<Integer>) number.clone();

     System.out.println("ArrayList: " + number); // [1, 3, 5]
     System.out.println("Cloned ArrayList: " + cloneNumber); // [1, 3, 5]
     
     
     
     
     
     
     ArrayList<String> languages= new ArrayList<>();
     languages.add("Java");
     languages.add("Python");
     languages.add("C");

     /* ArrayList<String> 을 String[] 배열로 변환 */

     // 방법 1 : 배열로 변환하고 반환
//     String[] arr1 = (String[]) languages.toArray();
//     System.out.println( arr1 );
     

     // 방법 1 : 매개변수로 지정된 배열에 담아 바환
     String[] arr2 = new String[languages.size()]; // 먼저 리스트 사이즈에 맞게 배열 생성
     languages.toArray(arr2);
     
     System.out.println( arr2 );
     for( String s : arr2) {
       System.out.println(s);
     }
     
     
     //정렬 예제
     ArrayList list8 = new ArrayList();
     list8.add("3");
     list8.add("2");
     list8.add("1");
      
     // 오름차순 정렬
     list8.sort(Comparator.naturalOrder());
     System.out.println(list8); // [1, 2, 3]

     // 내림차순 정렬
     list8.sort(Comparator.reverseOrder());
     System.out.println(list8); // [3, 2, 1]
     
     
     Iterator iter = list8.iterator();
     while(iter.hasNext()) {
       System.out.println( iter.next()) ;
     }
     
     
     
     
     
     
     
     
     
     

     

  }

}
