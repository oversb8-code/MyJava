package CH05_inheritance;

// 단일 상속
// 상속을 받는 클래스 = Sub class = 자식 클래스
// 상속을 해주는 Animal 클래스로부터, Dog 클래스가 상속 받습니다.
// class 서브클래스 extands 수퍼클래스
public class Dog extends Animal{ // 상속
    boolean guide ; // 안내견 여부 (t 또는 f)

    @Override
    public void bark() {
        System.out.println(super.name + "이(가) "+ hoolling + "하고 짖습니다.");
    } // 메소드 오버라이딩.

    // 오버라이딩 설명 다시 찾아보기

    @Override // 이 메소드는 오버라이딩 되었습니다. 주석으로 보는 경우도 있음.
    // 오버라이딩 : 상속관계의 부모가 가지고 있는 메소드를 자식이 입맛대로 재정의하는 것.
    // 오버라이딩을 왜 해야하는지 30초 정도 말할 수 있도록.
    public void display() {     // super는 이 클래스의 수퍼 클래스.
        super.display();

        if(guide){
            System.out.println("안내견 여부 : 적합");
        }else{
            System.out.println("안내견 여부 : 부적합");
        }




    }
}
