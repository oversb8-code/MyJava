package ch04_class;

public class Product02 { // 소프트웨어 모델링 - 클래스 만들기 01.
    // static 변수는 모든 객체들이 공유할 목적으로 사용되는 변수
    //클래스 이름으로 접근 가능해서 '클래스 변수' 라고도 부름.
   static String brand ; // 브랜드 (스태틱 변수 = 클래스 변수)
    // 스태틱 변수 = 공유하기 위한 변수 , 클래스 이름으로 접근이 가능.
    // 이후에 값을 바꿀건지 말지에 대해서는 보호 장치가 필요함.

    // 멤버 변수는 타입별로 기본 값이 있음.
    // 문자열(null), 정수(0) , 실수(0.0), bool(false)
    private String name ; // 상품명
    private int price ; // 단가 private , 접근지정자 private
    String inputdate ; // 입고 날짜 - 편의상 문자열로
//변수 왼쪽에 아무것도 안적혀있으면 디폴트(기본)

    // 보통 java에서는 대부분의 변수들은 private 설정을 하는게 일반적임.
    // 필요한것만 open하도록..

    // getter - 읽기
    // public int getPrice (){ // 접근지정자 + 반환타입 + 메소드 이름(매개 변수){리턴값}
    //   return price;}

    // setter - 쓰기
    // public void set  (int_price){price=_price;} // 접근 지정자 void set변수(변수타입 변수이름){해당 변수 = 변수이름;}
    // getter, setter 자동으로 하면 this가 붙음.

// getter, setter 위치는 상관없음.
    public void setPrice(int price){
        this.price=price;} //

    public int getPrice (){
        return price;}

    public void setName(String name){
        // 매개 변수는 지역 변수의 부분 집합 입니다.
        // 매개 ⊂ 지역
        // 지역이 넓은 범위
        this.name=name;} // this에 정보가 카피됨. this는 클래스 내부의 멤버 변수.

    public String getName (){
        return name;}



}
