package ch01_variable_operator;

public class Printme {
    static void main() {
        // 이름, 나이, 키, 몸무게, 혈액형 유형 진위
        // 변수 정의
        String name, blood ; // 문자열
        int age ; // 정수
        double height, weight ; // 실수
        char type ; // 문자 한개
        boolean bool ; // 진위 여부

        name = "홍길동";
        age = 30 ;
        height = 175.2;
        weight = 65.7;
        blood = "B";
        type = 'B';
        bool = true;

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 :" + weight);
        System.out.println("혈액형 :" + blood);
        System.out.println("타입 :" + type);
        System.out.println("진위여부 :" + bool);

    }
}
