package ch04_class;
//클래스를 정의함.
public class Product03 { // 주석은 기본값
    private String name; // null

    //상품의 단가가 입력되지 않으면 500원이라고 가정.
    private  int price = 500; // 기본값 0에서 500으로 덮어쓰기가 되는 것
    private  String inputdate; // null

// 기본 생성자 : 눈에 보이지 않음
// 정의 :  객체 생성 시 오직 단 한번만 호출되는 특수 메소드.
// 변수들의 값을 초기화할 목적으로

    // 생성자 만들기
    // 반환타입 메소드 이름(매개변수 리스트){...}
    // 생성자는 누구나 접근 가능하도록 앞에 public을 붙임.
    // 생성자를 만들면, 눈에 보이지 않는 생성자는 사라진다.
    // 주석 단축키 ctrl + /
    public Product03(){
        System.out.println("하하하");
    }

    // 매개변수는 생성자 메소드를 지나면 휘발되어 없어지므로
    // this. 를 사용하여 해당 매개변수의 값을
    // 같은 이름의 멤버 변수(인스턴스 변수)에 할당하도록 함.
    // (휘발 전에 사용하도록)

    public Product03(String name, int price, String inputdate){

        // 매개 변수가 사라지더라도 해당 값이 인스턴스 변수에 안전하게 저장되게 하기 위해 사용함.
        this.name = name; // 객체 자신(this)이 소유한 name 변수에 매개 변수 name의 값을 할당하시오
        this.price = price; // 인스턴스(멤버)변수와, 매개 변수가 이름이 같을 때 구분하기 위해 this. 사용
        this.inputdate = inputdate; // 인스턴스(멤버) 변수 = 매개 변수;
    }

    public Product03(String name, String inputdate){
        this.name = name;
        this.inputdate = inputdate;

    }

    // 오버로딩 (다중정의) : 같은 이름을 유지하되 매개변수만 변경해서 사용하는 것
    // 보통 15개 정도..

    public void display() {
        System.out.println("상품명 : "+name);
        System.out.println("단가 : "+price);
        System.out.println("입고 : "+inputdate);
    }
}
