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
        for (int i = 0; i < BTS.length ; i++) { // 일반 for
            // 보통 숫자, 순번을 가지고 무언가를 해야할 때 사용
            System.out.println(BTS[i]); // 결과물 출력하는 실행문구
        }

        // 확장 for (extends for)
        // 선입선출 (FIFO)
        System.out.println("향상된 for 구문");
        // for (타입 단수이름 : 복수 이름){} :은 약속임.
        for (String item : BTS){ // 단수 이름은 편한대로 적어도 됨.
            System.out.println(item);
    }
        // 후입선출 (LIFO)





    }



}
