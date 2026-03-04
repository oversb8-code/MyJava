package ch02_control_statement;

public class IF02 {
    static void main() {
        // 짝수이면 '하하하'를 홀수이면 '호호호'를 출력해주세요.

        // su%2==0 ,  true "하하하", false "호호호"
        // excel - if 함수랑 같음.
        // / 나누기, % 나눗셈 (나머지 산출)
        // if (조건식) {true} else {false} ;

        //변수 설정
        int su = 5;

//양자 택일 구문 - 양자택일 극단적이야 노래 참고하기..
        if(su%2==0) { //짝수이면
            System.out.println("하하하");
            System.out.println(su + "는 짝수");
        }else{ //홀수이면
            System.out.println("호호호");
            System.out.println(su + "는 홀수");
        }

    }
}
