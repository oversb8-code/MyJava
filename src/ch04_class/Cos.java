package ch04_class;

public class Cos {
    // 장르 이름, 캐릭터 이름, 의상, 소품
    String caracter_Name; // 캐릭터 이름
    String series_Name; // 장르 이름
    String clothes; // 의상
    String props; // 소품
    int difficult_Level; // 난이도
    private int cost; // 비용
    private String social_links; // SNS 업로드 링크

    // private >> main 에서 확인할 수 있도록
    // getter, setter 설정하는 과정

    public int getCost() {
        return cost;
    }

    public String getSocial_links() {
        return social_links;
    }

    public void setCost(int _cost) {
        cost = _cost;
    }

    public void setSocial_links(String _social_links) {
        social_links = _social_links;
    }


    // 반환 타입 메소드 이름 (매개변수 리스트) {...}
    // \n enter키 입력
    String name01() { // 메소드 작성 체크
        String result = "캐릭터 이름 : "+ caracter_Name + "\n장르 이름 : "+ series_Name + "\n의상 : "+ clothes + "\n소품 : "+ props + "\n난이도 : "+ difficult_Level + "\n비용 : "+ getCost();
        return result;
        }
    }



