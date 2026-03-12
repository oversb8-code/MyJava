package CH06_abstract_interface.cafeinterface;

public class Americano05 extends Beverage05 implements WaterAdjustable { //
private double waterAmount;

    public Americano05(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

    @Override
    public void Milkamount(double milk) {

    }

    @Override // 추상클래스의 메소드는 강제성이어서 꼭 구체화. 오버라이딩!!
    public void drink() { // 이 메소드는 추상 메소드를 구체화 한 메소드 입니다.
        System.out.println("물의 양이 "+ waterAmount + "ml인 "+ super.getName() + "를 뜨거운 물과 함께 마십니다.");
    }

    @Override
    public String toString() { // super. 으로 super class 메소드 호출해서 같이 출력되도록 하기.
        return super.toString()+ "\nAmericano05{" +
                " 물의 양 =" + waterAmount +
                '}';
    }


    @Override // 추상메소드
    public void adjustWater(double amount) {
        this.waterAmount += amount;
        System.out.println("물 추가 : "+amount + "ml");
        System.out.println("현재 물의 양 " + this.waterAmount);
    }
}
