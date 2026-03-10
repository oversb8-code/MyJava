package ch04_class;

public class ProductMain03 {
    static void main() {
        // 객체를 만든다
        // 클래스 이름 객체이름 = new 생성자 이름();
        Product03 shin = new Product03("신라면",1000,"2026/03/01");
        // 매개변수 갯수에 대응되는 생성자를 찾을 수 있어야함.
        shin.display();

        Product03 blackbean = new Product03("짜파게티","2026/03/10");
        // 단가 기본값을 안주면 500원이라고 가정해보기
        blackbean.display();

        Product03 banana = new Product03();
        banana.display();

        int size = 2; // 상품 2개
        //상품이 2개 있습니다.
        System.out.println("상품 " + size + "를 배열로 다뤄 봅니다.");

        //배열 new 연산자 기법
        int[] arr = new int[3] ; // 배열 문장 연습용

        // 배열 정의 - new 연산자 기법
        // 데이터가 여러개인 경우 배열을 사용함
        // 배열 정의 후 for 문장까지 사용해야함.
        Product03[] itemlist = new Product03[size];
        // class도 데이터 타입이므로 적어도 상관 없음.
        // 어떤 게 있다 하고 대충, 배열 정의


        // 0번째 객체 생성
        // 그게 무엇인지 제대로 알려주는 것.
        itemlist[0] = new Product03("소이조이",2000,"2025/08/15");
        itemlist[1] = new Product03("맥심 커피","2025/07/17");

        // 배열 원소 갯수 =>> itemlist.length

        for (int i = 0; i < itemlist.length ; i++) {
            //display() 메소드 활용
            System.out.println((i+1) + "번째 상품 정보");
            itemlist[i].display();



            // 배열 초기화 기법
            Product03[] productArray = {
                    new Product03("쭈쭈바",1500,"2025/12/25"),
                    new Product03("사과",3000,"2025/06/06"),
                    new Product03("오징어땅콩","2025/07/17")

            };

            for (int j = 0; j < productArray.length; j++) {
                System.out.println((j+1) + "번째 상품 정보");
            productArray[j].display();
            }


        }
    }
}
