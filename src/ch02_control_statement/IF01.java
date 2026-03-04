package ch02_control_statement;

public class IF01 { // 제어문 IF
    static void main() {
        // su가 짝수면 출력해주세요.
        int su = 6;

        // su%2==0 , true "짝수"
        // / 나누기 ,   % 나머지 산출
        // if(조건식), {true};
        // excel - if 함수에서 false 값만 없는 형태
        if(su%2==0){ // 단순 if 구문
            System.out.println(su +"는 짝수입니다.");
        }

        System.out.println("나는 무조건 실행됩니다.");
    }
}
