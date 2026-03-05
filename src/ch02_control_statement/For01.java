package ch02_control_statement;

public class For01 {
    static void main(String[] args) {
// 1부터 10까지의 총합

        int total = 0;

// i 변수 정의 = 이를 for 제어문의 초기식 제어 변수라고 부름
        for (int i = 1;      i < 11;     i++) {
         total += i;
        }
        System.out.println("총합01 : " + total);

//  total(생성)                             i(생성)
//  (초기식은 1번만 실행됨)
//       0                                   1
//       0+1                                 2
//       1+2                                 3
//       3+3                                 4
//       6+4                                 5
//      10+5                                 6
//      15+6                                 7
//      21+7                                 8
//      28+8                                 9
//      36+9                                10
//      45+10                             11(소멸)
//      출력
//      total(소멸)
    }
}
