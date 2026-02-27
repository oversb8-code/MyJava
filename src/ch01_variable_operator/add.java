package ch01_variable_operator;

public class add {
    static void main() {
        // 3 더하기 5는 8입니다.
        // 변수 정의(선언)
        int x ; // 정수형 데이터를 위하여 x를 준비하세요
        int y ;
        int result ;

        // 변수에 값을 할당(대입)
        x = 3 ; // 등호는 쓰기(할당)
        y = 5 ; // 등호는 쓰기(할당)
        result = x + y ; // + 기호는 덧셈, 불러오는 데이터는 읽기

        System.out.println("x = " + x); // + 기호 문자열 결합
        System.out.println("y = " + y);
        System.out.println("result = " +  result);

        // 3 더하기 5는 8입니다.
        System.out.println(x + " 더하기 " + y + " 는 " + result + " 입니다. ");

        //변수 variavle >> x , y
        x = 4 ; // 덮어쓰기. overwrite
        y = 8 ;
        result = x * y ;
        // 4 곱하기 8은 32입니다.

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("result = " + result);
        System.out.println(x + " 곱하기 " + y + " 은 " + result + " 입니다. ");






    }
}
