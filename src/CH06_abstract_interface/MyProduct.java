package CH06_abstract_interface;

import ch04_class.Product01; // 서로 다른 패키지에 있는 것을 쓰려면, import를 해야함.
// 동일한 패키지가 아니면 import 구문을 사용해야함.
// 반드시 public 이어야 함.
// 클래스 내의 변수/메소드 또한 public이 아니면 접근이 불가능

public class MyProduct {
    static void main() { // 서로 다른 패키지에서는 public으로 접근제어자가 되어 있어야 가능.
        Product01 apple = new Product01();
        apple.name = "사과";
        System.out.println("품목 이름 :"+ apple.name);
    }



}
