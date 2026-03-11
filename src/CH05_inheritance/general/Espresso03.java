package CH05_inheritance.general;
// 커피 메뉴의 공통점은 상단으로 - (메뉴, 단가)
public class Espresso03 extends Beverage03{ // 상속 관계 정의

    //shot 1잔 또는 2잔 변수
    private int shotCount; // 샷 추가 갯수

    public Espresso03(String name, double price, int shotCount){
        super(name,price);
        this.shotCount = shotCount;
    };


    public void printInfo() {
        super.showInfo();

        System.out.println("샷 :"+ shotCount + " 개 추가");
    }

}
