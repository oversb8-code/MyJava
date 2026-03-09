package ch04_class;

public class ProductMain02 {
    static void main() {

        Product02.brand = "농심"; //

        // 객체 생성 02
        // 클래스이름 객체이름 = new 생성자이름();
        Product02 shin = new Product02();
        // 단가는 비밀스러운 정보라서 외부로 노출하지 않을 겁니다. (접근지정자)

        Product02 blackbean = new Product02();

        // 멤버 변수에 값 할당 03
    shin.setName("신라면"); ; // 간접 쓰기
    shin.setPrice(1000); // 간접 쓰기
    shin.inputdate = "2026/03/01"; // 직접 쓰기

        System.out.println(shin.brand);
        shin.brand = "nongsim";

        System.out.println(blackbean.brand);


        System.out.println("상품명 : " + shin.getName()); // ()있으면 메소드
        System.out.println("단가 : " + shin.getPrice());
        System.out.println("입고 : " + shin.inputdate);

        for (int i = 0; i < 10; i++) {

        }

        for (int i = 0; i < 20; i++) {

        }

        //
    }
}
