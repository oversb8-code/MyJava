package CH05_inheritance.general;
// 커피 메뉴의 공통점은 상단
public class Latte03 extends Beverage03 { // 상속 관계 정의

    // 라떼는 우유
    private String milkType; // 우유의 타입
    public Latte03(String name, double price, String milkType ){
        super(name, price);
        this.milkType = milkType ;
    };

    public void printInfo() {
        super.showInfo();
        System.out.println("우유 타입 : "+milkType);

    }


}


