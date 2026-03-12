package CH06_abstract_interface.cafeinterface;

public class Cappuccino05 extends Beverage05 implements MilkAddable {
    public String milkType;
    public double foamAmount; // 거품량


    @Override
    public void changeMilk(String milkType) {
    }


    @Override
    public void Milkamount(double milk) {
        this.foamAmount += milk;
        System.out.println("거품량 추가 : "+milk + "ml");
        System.out.println("현재 거품량 " + this.foamAmount);
        System.out.println();
    }

    @Override
    public void drink() {
        System.out.println( "거품량이 "+ foamAmount + "추가 된" + super.getName() + "을 마십니다." );
    }

    //생성자 생성
    public Cappuccino05(String name, double price, String milkType, double foamAmount) {
        super(name, price);
        this.milkType = milkType;
        this.foamAmount = foamAmount;


}

    @Override
    public String toString() {
        return super.toString()+ "\nCappuccino05" +
                " 거품량 =" + foamAmount +
                '}';
    }
    }
