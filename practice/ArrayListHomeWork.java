package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListHomeWork {

  public static void main(String[] args) {
    // ArrayList 활용 앞뒤가 똑같은 문자열 체크하는프로그램 완성 (ex level 은 ok palindrome)
    List<String> list = new ArrayList<>();
    List<String> trg = new ArrayList<>();
    
    list.add("l");
    list.add("e");
    list.add("v");
    list.add("e");
    list.add("l");
    
    trg.add("l");
    trg.add("e");
    trg.add("v");
    trg.add("e");
    trg.add("l");
    
    Collections.reverse(list);
    
    System.out.println(list);
    System.out.println(trg);
    
    if(trg.equals(list)){
      System.out.println( " ok palindrome !! ");
    }else{
      System.out.println( " Not ok !! ");
    };
    
  }

}
