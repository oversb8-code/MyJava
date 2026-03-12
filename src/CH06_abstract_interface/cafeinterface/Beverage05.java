package CH06_abstract_interface.cafeinterface;
//수퍼클래스
public abstract class Beverage05 {
    // 추상 메소드가 있는 클래스도 추상 클래스여야함 abstract class

    // 카페 이름은 객체 생성하지 않아도 접근이 가능하도록 하는 것이 좋겠습니다.
    // final이 붙어 있으면 편집 불가능한 상수(constant)입니다.
    // 변수는 아님
    public static final String STORE_NAME = "G_Cafe" ;

    private static int beverageCount = 0; // 주문한 커피 잔 수


    public static int getBeverageCount(){
        return beverageCount;
    }


    private String name;
    private double price;


    public abstract void Milkamount(double milk);

    // 모든 음료는 마십니다.
    // 추상 메소드 - 추상적이므로 구체적인 행동이 없어서, 바디 {...} 도 없음.
    // 추상 메소드가 들어있는 클래스는 추상 클래스여야함.
    public abstract void drink();
    public String getName() {
        return name;
    }
    // alt + insert = 생성자 단축키
    public Beverage05() { // 매개변수 없는 생성자
    }
    public Beverage05(String name, double price) {
        this.name = name;
        this.price = price;

        beverageCount++; //커피 잔 수 +1
    }
    @Override
    public String toString() {
        return "Beverage05{" +
                "음료 이름 ='" + name + '\'' +
                ", 가격 =" + price +
                '}';

    }


/*


*/
    }