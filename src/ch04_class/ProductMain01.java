package ch04_class;

public class ProductMain01 { // 메인 클래스
    // 실행을 위한 클래스
    static void main() { // 메인 메소드는 무조건 필요
        // 단계 02 : 객체 생성
        // 추상적인 클래스로부터 구체적인 객체를 만들어내는 것.
        // 의미있는 값을 만들기 위해서 멤버 참조 연산자를 활용함.
        // '생성자 이름'은 '클래스 이름'과 동일해야합니다.
        // '클래스 이름' '객체 이름' = new 생성자 이름();
        Product01 shin = new Product01(); // 신라면
        // int x = ;

        Product01 blackbean ;
        blackbean = new Product01(); // 짜파게티
        // int y = ;
        // y = ;

        // 단계 03 : 멤버 변수에 값을 할당
        // 멤버 변수 = 기존 클래스에 있는 변수
        //  . 멤버 참조 연산자라고 부름
        shin.name = "신라면";
        shin.price = 1000;
        shin.inputdate = "2026/03/01";

        blackbean.name = "짜파게티";
        blackbean.price = 2000;
        blackbean.inputdate = "2026/03/09";


        // 단계 04 : 멤버 변수들의 값을 출력
        System.out.println("1번 상품 정보 출력");
        System.out.println("이름 : " + shin.name);
        System.out.println("단가 : " + shin.price);
        System.out.println("입고 : " + shin.inputdate);

        System.out.println("2번 상품 정보 출력");
        System.out.println("이름 : " + blackbean.name);
        System.out.println("단가 : " + blackbean.price);
        System.out.println("입고 : " + blackbean.inputdate);

        int su = 3 ;
        int result = shin.plus5(su); // 메소드를 호출한다.
        // 만든 메소드를 참조하기 위해서 멤버 참조 연산자를 활용.
        // shin.plus5(su) 는 클래스쪽 메소드에 들어감.
        // su => x 에 대입
        // int x;
        // x = su;
        // x+5 = 3+5 = 8
        // 정수 반환

        System.out.println("결과 : "+ result);
        // 메소드에서 반환한 리턴값 출력.
        // result = 8

        String str = shin.showdata();
        System.out.println(str);
        // 문자열 반환

        shin.Display();
        // 반환 X
        // void 리턴 안하므로 이렇게 적으면 끝
    }
}
