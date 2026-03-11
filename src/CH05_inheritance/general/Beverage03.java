package CH05_inheritance.general;
// 커피 메뉴의 공통점(단가 ...)을 Super 클래스에 두는 것 (일반화)

/*
서브 클래스가 수퍼 클래스의 변수에 접근
1. private은 getter/setter로 접근
2. private 대신에 protected로 작성 [접근 지정자 (public - protected - 기본 - private)]
3. 생성자를 통한 대입
*/


public class Beverage03 { //super class

    private String name; // 이름
    private double price; // 단가

    public Beverage03() {
    }

    ; // 사용을 하든 안하든 매개변수 없는 생성자를 만들어둠.


    //서브클래스에서 정의한 생성자 [super(매개변수);] 의 매개변수 갯수를 맞춰주는 작업
    public Beverage03(String name, Double price) {
        this.name = name; // 매개변수의 값을 멤버변수에 할당하기 위한 작업
        this.price = price; // this. 미사용시 멤버변수는 기본값으로 나옴.

    }

    ;

    protected void showInfo() {
        System.out.println("음료 이름 : " + name);
        System.out.println("단가 : " + price + "원");

    }
    // 일반적으로 생성자는 public


}
