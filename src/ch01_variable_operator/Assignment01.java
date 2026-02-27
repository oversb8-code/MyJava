package ch01_variable_operator;

public class Assignment01 { //대입연산자
    static void main() {
        int x = 5; //정수형 변수 x에 숫자 5를 대입 or 할당(assign) 해주세요.
// = 대입연산자는 오른쪽에서 왼쪽으로 할당한다.
        System.out.println("x : " +x);
// 산술연산자가 먼저 실행됨. 우선 순위 높음..
        // x=3 ; // 숫자 3 overwrite
        x += 3 ; // x= x+3 ; //누적해서 재할당(대입)
        //+= 붙여서 적어야 함.(복합대입)
        System.out.println("x :  " +x);

        x *= 4;
        System.out.println("x :  " +x);
        x %= 5;
        System.out.println("x :  " +x);
        x -= 1;
        System.out.println("x :  " +x);
        x += 5;
        System.out.println("x :  " +x);


    }
}
