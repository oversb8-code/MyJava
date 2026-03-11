package CH05_inheritance.general;

public class InheTest03 {
    static void main() { //보통 실행은 main 클래스에서

        // 생성자 = 멤버변수 값 초기화 용도
        // 객체 생성
        Americano03 americano = new Americano03("아메리카노",4000.0,200);
        Latte03 latte = new Latte03("라떼",6000.0,"아몬드 우유");
        Espresso03 espresso = new Espresso03("에스프레소",5000.0,2);

        double abc = americano.getWaterAmount(); // 다른 클래스에서 get, set 작업 후에 사용함..
        americano.printInfo();
        espresso.printInfo();
        latte.printInfo();

    }
}
