package CH06_abstract_interface.cafeinterface;

public class Espresso05 extends Beverage05 implements ShotAddable{ // 상속s

    private int shotCount ; // 샷추가.

    public Espresso05(String name, double price, int shotCount) { // 생성자
        super(name, price);
        this.shotCount = shotCount;
    }

    @Override
    public void Milkamount(double milk) {

    }

    @Override // 추상클래스의 메소드는 강제성이어서 꼭 구체화 해야함. 오버라이딩!
    public void drink() {
        System.out.println("샷개수 " + shotCount + "인 " + super.getName() + "을 진하게 한모금 마십니다.");
    }

    @Override
    public String toString() { // toString 오버라이딩
        return super.toString() + "\nEspresso05{" +
                "샷 추가 =" + shotCount +
                '}';
    }

    @Override
    public void addShot(int count) {
        this.shotCount += count;
        System.out.println( "샷이 "+ count +"개 추가 되었습니다.");
    }
}
