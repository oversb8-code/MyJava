package CH05_inheritance.mybeverage;

public class Latte04 extends Beverage04{
    private String milkType; // 우유의 타입

    @Override
    public String toString() {
        String milk = ", 우유 타입 : "+ milkType;
        return super.toString() + milk ;
    }

    public Latte04(String name, double price, String milkType ){
        super(name, price);
        this.milkType = milkType ;
    };

    public void feelling_milk(){
        String message = "부드럽고 크리미한 %s를 마십니다.\n";
        System.out.printf(message, super.getName());
    }
}
