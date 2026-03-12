package CH06_abstract_interface.cafeinterface;

//물의 양을 조절할 수 있도록 설계한 인터페이스
public interface WaterAdjustable {
    // 인터페이스의 모든 메소드는 추상 메소드 입니다.
    // 암시적으로 숨어있음.
    void adjustWater(double amount); //물 조절하기
}
