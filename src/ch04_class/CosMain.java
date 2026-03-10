package ch04_class;

public class CosMain {
        static void main() {
                Cos cosplay = new Cos(); // new 연산자

                cosplay.caracter_Name = " 라플란드 "; // 직접쓰기
                cosplay.series_Name = " 명일방주 ";
                cosplay.clothes = " 망토 달린 와이셔츠형 스커트 ";
                cosplay.props = " 가검, 동물 모양 귀, 꼬리, 광석병 타투, 와인잔 ";
                cosplay.setCost(280000); // 클래스에서 Setter, getter 설정 후에 할 것. 간접쓰기
                cosplay.difficult_Level = 4;
                cosplay.setSocial_links(" www.~~"); // 클래스에서 Setter, getter 설정 후에 할 것.

                String str = cosplay.name01(); // 메소드 호출
                System.out.println(str); // 메소드 결과값 출력 ( 문자열 )
                System.out.println("SNS 링크 : " + cosplay.getSocial_links()); // 클래스에서 Setter, getter 설정 후에 할 것.

                System.out.println("");

                //2026.03.10 4교시 이후. 수업 복습분.

                int size = 2;

                Cos[] cosp = new Cos[size];
                                cosp[0] = new Cos("라플란드","명일방주");
                                cosp[1] = new Cos(" 망토 달린 와이셔츠형 스커트 "," 가검, 동물 모양 귀, 꼬리, 광석병 타투, 와인잔 ");

                for (int i = 0; i < cosp.length; i++) {
                        System.out.println("정보");
                        cosp[i].display();
                }
        }

}


