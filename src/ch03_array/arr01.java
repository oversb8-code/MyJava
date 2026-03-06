package ch03_array;

public class arr01 {
    static void main() {



    String[] BTS = new String[7];

        BTS[0] = "진";
        BTS[1] = "뷔";
        BTS[2] = "RM";
        BTS[3] = "정국";
        BTS[4] = "슈가";
        BTS[5] = "지민";
        BTS[6] = "제이홉";

        System.out.println("출력");
        for (int i = 0; i < BTS.length ; i++) {
            System.out.println(BTS[i]); // 결과물 출력하는 실행문구
        }
    }
}
