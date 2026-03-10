package CH05_inheritance;

// 일반화 : 공통변수는 공통 클래스에, 특화된 개인 변수는 개인 클래스에
// 상속을 해주는 클래스 = Super class = 부모클래스

public class Animal { // Animal extands object
    // 상속 구조에서 제일 위가 object ( 보이지는 않으나 있음(java 자체에서 이미 생성되어있음) )
    String name ;
    int age ;
    String feed ; // 먹이
    String hoolling ; // 짖는 소리

    @Override   // 원래 toString 은 Object에 있고
                // toString은 원래 문자열을 반환하므로 문자열을 반환해주면 됨
    // 메소드 은닉화 : 오버라이딩 시 본의 아니게 부모 메소드 접근이 막히는 현상
    public String toString(){ // 한 번만 사용 가능
        String imsi = "이름 : " + name + ", 나이 : " + age + ", 먹이 : " + feed + ", 짖는 소리 : " + hoolling;
        return imsi;
    }

    public void eat(){
        System.out.println(name + "이(가) "+ feed +"를 먹습니다.");
    }

    public void bark(){
        System.out.println(name + "이(가) "+ hoolling +"하고 웁니다.");
    }

// 반환타입 메소드이름(매개변수){...}
    // 코딩 순서 넘버링 해보기.
    public void display(){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
    }
    //eat(), bark()
}
