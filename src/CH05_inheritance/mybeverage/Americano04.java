package CH05_inheritance.mybeverage;

public class Americano04 extends Beverage04{
    private double waterAmount;

    @Override //  오버라이딩 하기
    public String toString() {
        String imsi = ", 물의 양 : " + waterAmount;
        return super.toString() + imsi; // 일반적으로는 super. 붙임.
    }

    public Americano04(String name, double price, double waterAmount){
        // 서브 클래스 생성자의 첫 줄에는 super(); 라는 단어가 숨어 있음.
        // 매개변수가 없는 super 클래스의 생성자
        // 사용자가 super(매개변수); 형식으로 다시 작성하면, super(); 는 사라짐.
        super(name, price); // 생성자를 통하여 데이터를 수퍼클래스에 넘겨주는 작업
        this.waterAmount = waterAmount; // 멤버변수 waterAmount에 매개변수 waterAmount의 값을 할당하기 위한 작업
    };

// sip : 홀짝 마시다


    public void sipAmericano(){
        String message = super.getName() + "를 홀짝 홀짝 마십니다.";
        System.out.println(message);
    }
}
