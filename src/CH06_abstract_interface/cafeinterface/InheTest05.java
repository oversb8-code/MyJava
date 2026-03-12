package CH06_abstract_interface.cafeinterface;

import CH05_inheritance.Cat;

public class InheTest05 {
    static void main() {
        // Beverage05.STORE_NAME = "하하하";
        System.out.println("어서오세요~~ " + Beverage05.STORE_NAME + "입니다.");

        // 부모 타입을 사용한 배열 생성
        Beverage05[] orderList = {
                new Americano05("아메리카노", 2500.0, 200),
                new Espresso05("에스프레소", 5000.0, 1),
                new Espresso05("아포카토", 6000.0, 2),
                new Cappuccino05("카푸치노", 6000.0, "우유",200.0),
                new Latte05("카페라떼", 4500.0, "바닐라 우유"),
                new SpecialCoffee("스페셜커피", 6000.0, 150, 2, "우유")
        };

        System.out.println("주문 잔 수 : " + Beverage05.getBeverageCount());


        System.out.println("향상 for");
        for (Beverage05 item : orderList) {
            System.out.println("-------------------------------");
            System.out.println(item);
            if (item instanceof Americano05) {
                ((Americano05) item).adjustWater(20); // instanceof
            } else if (item instanceof Espresso05) {
                ((Espresso05) item).addShot(1); // instanceof
            } else if (item instanceof Latte05) {
                ((Latte05) item).changeMilk("초코 우유");
            } else if (item instanceof SpecialCoffee) {
                ((SpecialCoffee) item).addShot(1);
                ((SpecialCoffee) item).adjustWater(50);
                ((SpecialCoffee) item).changeMilk("아몬드 우유");
            } else if (item instanceof Cappuccino05) {
                ((Cappuccino05) item).Milkamount(200.0);


                item.drink(); // 강등할 필요 없음.
                System.out.println();
            }
            ;
            // 상속 > 인터페이스 상속 > 추상 메소드, toString 오버라이딩 > 생성자 생성
            // 배열 생성 > for 구문 > if else


        }
    }
}
