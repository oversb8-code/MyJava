package ch02_control_statement;

import org.w3c.dom.ls.LSOutput;

public class Totalexam01 { // 변수 체크.
    static void main(String[] args) {

        int kor = 85, eng = 70, math = 90;
        int sum = kor + eng + math;
        int ave = sum/3;

        String name = "김철수";


        String grade = "";

        if (ave>= 90) {
              grade = "A";
        } else if (ave>= 80) {
            grade = "B";
        } else if (ave>= 70) {
            grade = "C";
        } else if (ave>= 60) {
            grade = "D";
        } else {
            grade = "F";

        }





        String message = "";


        switch (grade) {
            case "A": case "B":
                message = "참 잘하셨어요.";
                break;

            case "C": case "D":
                message = "조금만 더 노력하세요.";
                break;

            case "F":
                message = "다음 학기에 재수강하세요.";
                break;

            case "오류":
                message = "잘못된 입력입니다.";
                break;
        }



        System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 :%d, 총점 : %d, 평균 : %d, 학점 : %s, 메세지 : %s",name, kor, eng, math, sum, ave, grade, message);
        System.out.println();;
        System.out.println();

        System.out.println("이름 : " + name + "님");
        System.out.println("국어 : " + kor + "점");
        System.out.println("영어 : " + eng + "점");
        System.out.println("수학 : " + math + "점");
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + ave + "점");
        System.out.println("학점 : " + grade + "학점");
        System.out.println("메세지 : " +  message );
    }

}



/*
이름과 국어, 영어, 수학 점수를 이용하여 학점을 매기세요.
학점은 세 과목의 평균을 이용하여 매기세요.

String name = "김철수";
int kor = 85, eng = 70, math = 90 ;

String grade ; // 학점 변수

String message = "" ;

switch
학점이 "A" 또는 "B"이면 "참 잘 하셨습니다."를 message 변수에 저장한다.
학점이 "C" 또는 "D"이면 "조금만 더 노력하세요."를 message 변수에 저장한다.
학점이 "F"이면 "다음 학기에 재수강하세요."를 message 변수에 저장한다.
그 외의 값이 입력되면 "잘못된 입력입니다."를 message 변수에 저장한다.

출력 예시
이름 : 김철수님
국어 : 85점, 영어 : 70점, 수학 : 90점
총점 : 245점, 평균 : 81.66666
학점 : B
메시지 : 참 잘 하셨습니다.
*/