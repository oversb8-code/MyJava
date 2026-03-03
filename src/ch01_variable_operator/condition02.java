package ch01_variable_operator;

public class condition02 { // 조건연산자 = 조건식 ? 참 : 거짓 ;
    static void main() {
        int x = 10, y= 20;

        // 2개의 숫자 중에서 큰 수 고르기
        // excel if문 참고 (유사한 것 같음)
        // 타입 result  = 조건식 ? 참일 때 처리 : 거짓일 때 처리 ;
        // 조건 연산자 = 조건식 ? 참 : 거짓 ;
        // 3항 연산자
        int result  = x >= y ? x : y  ;
        System.out.println("result :" +result);

        // x가 짝수인지 홀수인지 판단해보세요.
        // x= 10


        String str  = x%2 == 0 ? "짝" : "홀"  ;
        //"짝""홀"이 대입되려면 String (문자열)으로 타입을 적어야함.
        // 변수 이름은 같은 걸 지정할 수 없음.

        System.out.println("str :" +str);


        x = 6;
        // x가 3의 배수이면 제곱을, 아니면 더하기 5의 결과 출력하기

        // 타입 result  = 조건식 ? 참일 때 처리 : 거짓일 때 처리 ;
        int re = x%3 == 0 ? x*x : x+5 ;
        System.out.println("re : " +re);


        int month = 3 ;
        str = month >=3 && month <= 5 ? "봄" : "다른 계절" ;
        System.out.println("결과 : " + str);
//***

    }
}
