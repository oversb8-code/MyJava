package ch01_variable_operator;

public class Logicaloperator { // 관계 연산자  = 비교 연산자라고 하기도 함
    // < 작음, > 큼
    // <= 작거나 같음, >= 크거나 같음
    // == 같음, != 같지 않음
    // 참 또는 거짓 (진위 구분) boolean bool
    static void main() { // 프로그램 시작점
int x = 3, y = 2 ; // 변수 정의

        System.out.println("x="+x+",y="+y);
        System.out.println("x>y:"+(x>y));
        System.out.println("x>=y:"+(x>=y));
        System.out.println("x<y:"+(x<y));
        System.out.println("x<=y:"+(x<=y));
        System.out.println("x==y:"+(x==y)); // 같다 equal
        System.out.println("x!=y:"+(x!=y)); // 같지 않다

// not ! and && or|| (논리연산자)
   // 논리곱 & 논리합 표
        //  식1 식2 논리곱&& 논리합 ||
        //  f   f     f       f
        //  f   t     f       t
        //  t   f     f       t
        //  t   t     t       t

        System.out.println("4<5 && 3 != 6:"+(4<5 && 3 != 6));


        boolean bool = 4>7 || 3 == 6;
        System.out.println("4>7 || 3 == 6:"+(bool)); // 진위값 boolean 으로 해도됨.

        bool = !bool;
        System.out.println("bool:"+(bool)); // 진위값 false -> true 변경

        int month = 3;
        boolean result = month >= 3 && month <= 5 ;
        System.out.println("result:"+(result));


    }
}
