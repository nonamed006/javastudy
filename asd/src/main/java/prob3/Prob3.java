package prob3;

import java.util.Scanner;

public class Prob3 {
   public static void main(String[] args) {

      System.out.print("입력: ");
      Scanner scanner = new Scanner(System.in);

      int num = scanner.nextInt();
      int sum = 0;

      Boolean flag = num % 2 == 0;
      
      for(int i = 0; i <= num; i++) {
         if(flag) {
            // 2의 배수면
            if(i % 2 == 0) {
               sum += i;
            }
         }else {
            if(i % 2 != 0) {
               sum += i;
            }
         }
      }
      System.out.println(sum);
      scanner.close();
   }
}