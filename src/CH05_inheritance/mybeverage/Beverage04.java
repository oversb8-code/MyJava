package CH05_inheritance.mybeverage;

public class Beverage04 {

    private String name; // 이름
    private double price; // 단가

    @Override // 오버라이딩(재정의) object >> Super
    // 재정의를 왜 하는지.
    public String toString() { // 이걸 써서 문자를 출력해라
       String imsi = "상품명 : " + name + ", 단가 : "+ price;
        // return super.toString() + "\n" + imsi; // 오브젝트 것(super.toString)과 함께 출력해
        return imsi; // 어느 것을 호출할지 말지는 본인 선택
    }

    public String getName() {
        return name;
    }


    public Beverage04() {
    }

    ; // 사용을 하든 안하든 매개변수 없는 생성자를 만들어둠.


    //서브클래스에서 정의한 생성자 [super(매개변수);] 의 매개변수 갯수를 맞춰주는 작업
    public Beverage04(String name, Double price) {
        this.name = name; // 매개변수의 값을 멤버변수에 할당하기 위한 작업
        this.price = price; // this. 미사용시 멤버변수는 기본값으로 나옴.

    }

    ;

    protected void showInfo() {
        System.out.println("음료 이름 : " + name);
        System.out.println("단가 : " + price + "원");

    }


}
