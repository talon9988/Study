package practice;
//교재1 140p 확인문제2 : 표현식으로 씀(거의 안쓰이는방법)
public class Example2 {
  public static void main(String[] args) throws Exception {
    String grade = "B";
    int score1 = 0;
    switch (grade) {
    	case "A" -> {
    		score1 = 100;
    	}
    	case "B" -> {
    		int result = 100 - 20;
    		score1 = result;
    	}
    	default -> {
    		score1 = 60;
    	}
    }
    System.out.println("점수는 :" + score1 + " 등급은 : " + grade + "입니다");
  }
}
