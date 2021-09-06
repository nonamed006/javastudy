package prob4;

import java.util.Scanner;

public class Prob4 {

   public static void main(String[] args) {
      // 문자열을 입력 받아서 아래와 같은 실행결과가 나타나도록 Prob4 클래스의 main 메쏘드를 
      // 완성 하세요. 입력 받은 문자열을 한 글자씩 증가시키며 출력하는 프로그램입니다.

      Scanner scanner = new Scanner(System.in);

      System.out.print("문자열을 입력하세요 : ");
      String text = scanner.nextLine();
      
      for(int i = 1; i <= text.length(); i ++) {
         System.out.println(text.substring(0, i));
         
      }
      
      scanner.close();
   }

}