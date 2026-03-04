package ch02_control_statement;

public class switch03 { // 괄호 갯수 체크 오류남 ***
    static void main(String[] args) {
        String name = "김철수";
        String grade = "A"; // 고객 등급(A, B, C)중 하나
        String present = ""; // 등급에 따른 선물


        switch (grade) {
            case "A":
                present += " 강남 빌딩"; // 문자열 결합 += 으로 모든 결과값 한번에 출력시 break 없어도 됨.

            case "B":
                present += " 자동차 ";

            case "C":
                present += " 노트북 ";



        }
        String message = "%s님의 경품은 %s입니다";
        System.out.printf(message, name, present);



        double average = 74.6666666666 ;
       // message = "평균 : %f";기본은 소숫점 6째자리까지.
        message = "평균 : %.3f";
        //printf의 f는 format
        System.out.printf(message,average);


    }
}



