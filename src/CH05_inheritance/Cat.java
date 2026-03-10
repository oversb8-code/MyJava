package CH05_inheritance;

public class Cat extends Animal {
    boolean indoor ; // 반려묘, 길냥이 여부

    public void bark(){
        System.out.println(super.name + "이(가) "+ hoolling + "하고 웁니다.");
    }

    @Override
    public void display() {
        super.display();

        if(indoor){
            System.out.println("반려묘");
        }else{
            System.out.println("길냥이");
        }
    }
}
