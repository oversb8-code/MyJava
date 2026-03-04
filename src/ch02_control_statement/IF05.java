package ch02_control_statement;

public class IF05 {
    static void main() { // % 하고 / 구분하기..
// su 가 7의 배수이면 제곱하여 출력하고, 7의 배수가 아니면 3을 더하기

        // 변수 정의
        int su = 7;

        // su% 7 == 0, true =  su*su , false = su + 3
        if (su % 7 == 0) {
            System.out.println(su * su + " 입니다.");
        }else if (su%7!=0){System.out.println(su + 3 + "입니다.");};


    }
}
