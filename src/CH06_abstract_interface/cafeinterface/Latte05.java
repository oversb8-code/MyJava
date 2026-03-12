package CH06_abstract_interface.cafeinterface;

public class Latte05 extends Beverage05 implements MilkAddable { // 상속
    private String milkType;

    public Latte05(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }


    @Override
    public void Milkamount(double milk) {

    }

    @Override  // 추상클래스의 메소드는 강제성이어서 꼭 구체화, 오버라이딩!!
    public void drink() {
        System.out.println(" 우유의 타입이 "  + this.milkType +"인 " +super.getName() +"을 마십니다.");
    }

    @Override
    public String toString() {
        return "Latte05{" +
                "milkType='" + milkType + '\'' +
                '}';
    }

    @Override
    public void changeMilk(String milkType) {
        System.out.println("우유의 타입이 "+ this.milkType + "에서 " + milkType + "으로 변경되었습니다.");
        this.milkType = milkType;

    }

}
// 상속 - 인터페이스 상속 - 추상 메소드 생성 - 생성자 생성

