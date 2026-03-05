package ch02_control_statement;

public class FOR {
    static void main() {
        //1부터 10까지의 정수 중에서 짝수와 홀수의 합을 각각 구하시오.

        //1+3+5+7+9
        //2+4+6+8+10

        int odd = 0, even = 0; // 홀수 짝수

        for (int i = 1; i<11 ; i++) {
          if(i%2==0){ // 짝수인지 묻는 조건식
              even += i; // true 이면 실행
          }else{
              odd += i; // false 일시 실행
          }
        }

        System.out.println("홀수의 합 : " + odd);
        System.out.println("짝수의 합 : " + even);



    }
}
