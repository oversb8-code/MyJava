package ch02_control_statement;

public class switch01 {
    static void main() {

        // 주사위 눈금의 수가 짝수인지 홀수인지 판단하기.
        int su = 0;

        // switch - case 구문
        // switch (변수) {
        //      case :
        //
        // }
        System.out.println("초급자가 코딩하는 방식");
        switch (su){
            case 1:
                System.out.println("홀수");
                break;
            case 2:
                System.out.println("짝수");
                break;
            case 3:
                System.out.println("홀수");
                break;
            case 4:
                System.out.println("짝수");
                break;
            case 5:
                System.out.println("홀수");
                break;
            case 6:
                System.out.println("짝수");
                break;

        }

        System.out.println("중급자가 코딩하는 방식");
switch (su) {
    case 1:
    case 3:
    case 5:
        System.out.println("홀수");
        break;
    case 2:
    case 4:
    case 6:
        System.out.println("짝수");
        break;

}
        // 이렇게 하는 방법도 있음..
    switch (su) {
    case 1: case 3: case 5:
            System.out.println("홀수");
            break;
            case 2: case 4: case 6:
            System.out.println("짝수");
            break;

        default: // case에 없는 항목이 오면 이것이 실행됨.
            System.out.println("잘못된 숫자 형식입니다.");
        }
}
    }

