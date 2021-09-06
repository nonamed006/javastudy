package prob5;

public class Prob5 {

   public static void main(String[] args) {
      // 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보세요. 1부터 99까지만 실행하세요.
      
      
      for(int i=1; i<100; i++) {
               
         if(i<10) {
            if(i == 3 || i == 6 || i == 9) {
               System.out.print(i);
               System.out.println(" 짝");
            }
         } else {
            boolean b1 = false;   // 십의 자리 수 조건 판별
            boolean b2 = false;   // 일의 자리 수 조건 판별
               
            int n1 = i / 10;     // n1은 십의 자리 수
            int n2 = i % 10;     // n2는 일의 자리 
               
            if(n1 == 3 || n1 == 6 || n1 == 9) {
               b1 = true;
            }
               
            if(n2 == 3 || n2 == 6 || n2 == 9) {
               b2 = true;
            }
               
            if(b1 && b2) {
               System.out.print(i);
               System.out.println(" 짝짝");
            } else if(b1 || b2) {
               System.out.print(i);
               System.out.println(" 짝");
            } 
         }
      }
         
   }
}