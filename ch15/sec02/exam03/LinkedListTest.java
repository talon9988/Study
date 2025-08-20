package ch15.sec02.exam03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

  public static void main(String[] args) {
    // 다양한 방법으로 LinkedList 생성
    LinkedList<Integer> integers1 = new LinkedList<Integer>(); // 타입 지정
    LinkedList<Integer> integers2 = new LinkedList<>(); // 타입 생략 가능
    LinkedList<Integer> integers3 = new LinkedList<>(integers1); // 다른 Collection값으로 초기화
    LinkedList<Integer> integers4 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList()
    
    System.out.println(integers1);
    System.out.println(integers2);
    System.out.println(integers3);
    System.out.println(integers4);
    
    
    
    
    
//    LinkedList<String> colors = new LinkedList<>();
//    // add() method
//    colors.add("Black");
//    colors.add("White");
//    colors.add(0, "Green");
//    colors.add("Red");
//    
//    // set() method
//    colors.set(0, "Blue"); //.set(): 인덱스 0번째 값을 덮어씌움
//
//    System.out.println(colors);
//    
//    String removedColor = colors.remove(0); //블루 삭제
//    System.out.println("Removed color is " + removedColor);
//
//    if( colors.remove("Purple") ) { //보라색은 없으므로 false
//      System.out.println(colors);
//    };
//    
//    colors.clear();
//    System.out.println(colors);
    
    
//    LinkedList<String> colors = new LinkedList<>(Arrays.asList("Black", "White", "Green", "Red"));
//    // for-each loop
//    for (String color : colors) {
//        System.out.print(color + "  ");
//    }
//    System.out.println();
//
//    // for loop
//    for (int i = 0; i < colors.size(); ++i) {
//        System.out.print(colors.get(i) + "  ");
//    }
//    System.out.println();
//
//    // using iterator
//    Iterator<String> iterator = colors.iterator();
//    while (iterator.hasNext()) {
//        System.out.print(iterator.next() + "  ");
//    }
//    System.out.println();
//
//    // using listIterator
//    ListIterator<String> listIterator = colors.listIterator(colors.size());
//    while (listIterator.hasPrevious()) {
//        System.out.print(listIterator.previous() + "  ");
//    }
//    System.out.println();
    
    
    
    LinkedList<String> colors = new LinkedList<>(Arrays.asList("Black", "White", "Green", "Red"));
    boolean contains = colors.contains("Black");
    System.out.println(contains);

    int index = colors.indexOf("Blue"); //블루는 리무브 됬으므로 인덱스 값이 음수로 나옴(-1)
    System.out.println(index);

    index = colors.indexOf("Red");
    System.out.println(index);
    
    
    
    
    
    
    
  }

}
