package ch04.sec08.practice;

public class Example2 {
  public static void main(String[] args) throws Exception {
    String grade = "B";
    int score1 = 0;
    switch (grade) {
    case "A":
      score1 = 100;
      break;
    case "B":
      int result = 100 - 20;
      score1 = result;
      break;
    default:
      score1 = 60;
    }
  }
}
