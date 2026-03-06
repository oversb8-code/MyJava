package ch02_control_statement;

import java.util.Scanner; // 스캐너 class 사용 시 자동 생성됨.

public class While3 { // 조건식이 참(true)인 while
    static void main() {
        // 문제 : 1~100 사이의 숫자 맞추기
int answer = 40 ; // 컴퓨터가 생각하고 있는 숫자

        //바코드 스캐너 준비, 스캐너는 외부에서 가져와야함
        Scanner scan = new Scanner(System.in); // scan - 객체

        while(true){ // endless while loop  = 무한 while 루프
            System.out.println("1 부터 100 사이의 정수 1개 입력하세요.");
            int input = scan.nextInt(); // 사용자가 입력한 숫자
            System.out.println("입력한 숫자 : " + input);


            //단순 if -> if else 변경

            if(answer == input){ // 맞춘 경우
                System.out.println("정답입니다.");
                break;

            }else if(answer > input){ // 정답이 큰 경우
                System.out.println(input + "보다 큰 수입니다.");

            }else{ // 정답이 작은 경우
                System.out.println(input +" 보다 작은 수입니다.");
            }

        }
    }
}
// if while , break; if else
//