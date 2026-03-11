package CH05_inheritance.general;
// 커피 메뉴의 공통점은 상단으로 - 특징적인 부분은 하단(sub)
public class Americano03 extends Beverage03 { // 상속 관계 정의

    //물의 양 변수
    private double waterAmount; // 투입하는 물의 양

    //  Americano03(){}; 생성자는 원래 1개가 숨어있음.
    // 새로 정의했기 때문에 따라서 정의한 생성자 (매개변수)형태로 설정을 다시 해줄것.
    public Americano03(String name, double price, double waterAmount){
        // 서브 클래스 생성자의 첫 줄에는 super(); 라는 단어가 숨어 있음.
        // 매개변수가 없는 super 클래스의 생성자
        // 사용자가 super(매개변수); 형식으로 다시 작성하면, super(); 는 사라짐.
        super(name, price); // 생성자를 통하여 데이터를 수퍼클래스에 넘겨주는 작업
        this.waterAmount = waterAmount; // 멤버변수 waterAmount에 매개변수 waterAmount의 값을 할당하기 위한 작업
    };

    public void printInfo() {
        super.showInfo();

        System.out.println("투입된 물의 양 : "+ waterAmount + "ml");
    }

    // get set 은 다른 클래스에서 private 된 값을 가져가기 위한 용도
    // 그래서 밑에 작업한 뒤에 다른 클래스에서
    // double abc = americano.getWaterAmount();
    // 이런 식으로 사용.

    public double getWaterAmount() { // 읽기
        return waterAmount;
    }
    public void setWaterAmount(double waterAmount) { // 쓰기
        this.waterAmount = waterAmount;
    }


}
