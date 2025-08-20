package ch15.sec03.exam02;

import java.util.HashSet;

public class HashSetProblem {
  public static void main(String[] a) {
    // 로또 번호 발생기 작성
    HashSet<Integer> lotto = new HashSet<>();
    while(lotto.size() < 6) {
      lotto.add( (int)(Math.random()*45)+1 );
    }
    System.out.println(lotto);
  }
}
