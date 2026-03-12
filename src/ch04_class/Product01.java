package ch04_class;
// 재사용 할 수 있기 때문에 한 클래스에는 하나의 내용만

public class Product01 { // 단계 01 : 클래스 정의
    // 클래스 이름은 통상적으로 맨 앞을 대문자로.
    // 상품이 가질 수 있는 정보 - 이름 - 문자열, 단가 - 정수, 입고 날짜 - 날짜
    //  해당 클래스는 구체적인 상품이 아니라, 상품을 뭉뚱그려서 틀로 표시해둔 것.
    // 멤버 변수
   public String name ; // 상품명 public
   int price ; // 단가
   String inputdate ; // 입고 날짜 - 편의상 문자열로

    // 변수(속성), 메소드(행동), 생성자
    // 메소드 = 함수
    // 상품들의 정보를 보여주는 디스플레이 = 보여주는 행동이므로 메소드
    // 메소드 이름 , 데이터 타입과 갯수(매개변수), 데이터 반환 타입

    // ex) 정수 1개를 입력받아서 +5를 수행하고 값을 반환합니다.
    // '매개변수'는 메소드 외부에서 넣어주는 값
    // 반환 타입 메소드 이름 (매개변수 리스트) {...}
    // 반환은 return 적어야함..(돌려줘야한다는 의미)
 int plus5 (int x){
     return x+5;


 }

        // 상품명 : 신라면, 단가 : 1000원, 입고 : 2026/03/01
    String showdata (){
     String result = "상품명 : " + name + ", 단가 : " + price + ", 입고 : " + inputdate ;
     return result ;
    } // 매개변수가 필요없더라도 소괄호를 없애면 안됨.

    // 메소드가 값을 반환하지 않을 때 void 사용.
    void Display(){
        System.out.println("상품명 : " + name);
        System.out.println("단가 : " + price);
        System.out.println("입고 : " + inputdate);
    }


}
