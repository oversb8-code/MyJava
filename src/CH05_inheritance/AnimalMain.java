package CH05_inheritance;

public class AnimalMain { // 암시적으로 object 상속받았다.
    static void main() {

        // 객체 생성
        // 클래스 이름 객체 이름 = new 생성자이름();
        // super에 메소드를 만들어두면 sub에 상속되기 때문에
        // 쓸 수 있다.

        Dog retriver = new Dog();
        retriver.name = "김리트리버";
        retriver.age = 2;
        retriver.feed = "로얄캐닌 세타이어티";
        retriver.guide = false;
        retriver.hoolling = "왈왈";
        retriver.display(); // 부모클래스에 만들었기 때문에 상속 받아서 메소드가 나옴.
        retriver.eat();
        retriver.bark();


        // retriver.toString() 문자열 반환
        // CH05_inheritance.Dog@7adf9f5f
        // 해시코드의 16진수 값인 toString 메소드를 오버라이딩하여 문자열로 반환

        System.out.println("객체 정보");
        System.out.println(retriver.toString());

        Dog maltese = new Dog();
        maltese.name = "미르";
        maltese.age = 3;
        maltese.guide = false;
        maltese.feed = "힐스 W/D";
        maltese.hoolling = "낑낑";
        maltese.display();
        maltese.eat();
        maltese.bark();

        Cat persian = new Cat();
        persian.name = "호두";
        persian.age = 6;
        persian.feed = "닥터힐메딕스 소프트 로우펫";
        persian.hoolling = "야옹";
        persian.indoor = true;

        persian.display();
        persian.eat();
        persian.bark();

        Cat siamese = new Cat();
        siamese.name = "달이";
        siamese.age = 12;
        siamese.feed = "NOW";
        siamese.indoor = true;
        siamese.hoolling = "미야옹";
        siamese.display(); // 결과값 출력
        siamese.eat();
        siamese.bark();

    }
}
//메소드 은닉화
//          toString()
// object       O
// Animal       O
// Dog          X
