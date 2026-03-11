package CH05_inheritance.mybeverage;

public class InheTest04 {
    static void main() {

        // 승급(업캐스팅)         : 낮은 등급의 클래스가 높은 등급의 클래스 타입으로 한시적 형태가 바뀌는 동작
        // upcasting(암시적)     : 두 클래스가 상속 관계라는 전제 조건이 있어야 가능.
        // 참조형변환.



        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250);
        // 관리를 쉽게 하려고 업캐스팅함.
        // 반복문    for
        beverage01.showInfo();
        // 수퍼 클래스에 들어 있는 메소드는 상속의 개념에 의해 접근 가능.

        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2);
        beverage02.showInfo();


        Beverage04 beverage03 = new Latte04("라떼", 6000.0, "딸기 우유");
        beverage03.showInfo();


// 다운캐스팅 - 명시적
        Americano04 coffee = (Americano04) beverage01;
        coffee.sipAmericano();
        Espresso04 coffee1 = (Espresso04) beverage02;
        coffee1.drinkEspresso();
        Latte04 coffee2 = (Latte04) beverage03;
        coffee2.feelling_milk();
        System.out.println();


        // 승급 개념과 배열의 사용
        // 어떤 걸 써야하는지 생각해보기.
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("마이뿌레소", 2000.0, 1),
                new Latte04("바나나 라떼", 7000.0, "바나나 우유")
        };
        for (int i = 0; i < beverage.length; i++) {
            System.out.println("-------------------------------");
            beverage[i].showInfo();

            // instanceof 가 왜 필요한지 생각해보기.
            // instanceof : 승급된 객체 변수가 수많은 서브 클래스 중에서 어떤 클래스로
            //              생성되었는지를 판단하고자 할 때 사용함.
            if (beverage[i] instanceof Americano04) { // 아메리카노
                Americano04 ameri_ = (Americano04) beverage[i]; // 강등
                ameri_.sipAmericano();

            } else if (beverage[i] instanceof Espresso04) { // 에스프레소
                Espresso04 Esp_ = (Espresso04) beverage[i];
                Esp_.drinkEspresso();

            } else if (beverage[i] instanceof Latte04) { // 라떼
                Latte04 Latt = (Latte04) beverage[i];
                Latt.feelling_milk();

            } else { //... etc

            }

            System.out.println(beverage[i]);
//
// 객체를 프린트 하면 암시적으로 toString(); 메소드가 호출이 됩니다.
            //오버라이딩 하지 않으면 object 것으로 출력됨.
            //결과물 : CH05_inheritance.mybeverage.Americano04@63961c42
// sub -> super -> object
// 오버라이딩 왜 하는지 다시 생각해보기.
        }
    }
}
// 금요일 1~5교시 만들어보기.
// 이런 식으로 만들 걸 정리해오기.

// 카페 - 메뉴 이름 - 음료,단가,+@
// 이런식으로 직관적으로 보여야함.
// 금요일

// 냉장고를 부탁해(프로그램명): 메인 클래스
// 어떻게 서브 클래스나, 이런 거로 쪼갤지 고민하기
// 방영 시간 및 방송사 이름 : ~~
// 요 리 사  : 김풍, 손종원, 정호영 , +@
// 오늘의 주제 : 요리사가 정한 음식 이름
// 냉장고 재료(필수 재료 + 추가 재료)
// 결과 : 승리자, 패배자

// 냉장고를부탁해 - 냉장고 (재료) - 셰프(요리) - 결과 ?
// 냉장고를 부탁해 - 셰프 - 결과?
// 이게 간단할 것 같음.
// 어디에 뭐 들어갈지는 고민하기.
// 메인 프로그램명
// 공통 - 방영 시간, 냉장고(재료)
// 재료, 요리, 셰프, 결과  클래스 ?
// 재료에 냉장고 재료 (재료 수량, 재료 이름)?
// 요리 (완성된 요리), 요리 스타일(중식,한식,양식)
// 셰프 - 셰프 이름(배열), 요리
// 결과 - 승리자 or 패배자
// 출력 -

// 어떤 요리 도구를 쓰는지? 이것도 ?
//
// 배열로 요리사 이름, 요리 스타일 작성..?
// 결과 if else ,boolean


