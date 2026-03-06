package ch02_control_statement;

import java.util.Scanner;

public class while_loop01 {
    static void main() {
        // 음수가 나오면 멈추고 , 총점 , 평균 계산 출력

        int total = 0; // 총점
       double average = 0.0 ; // 평균
int counter = 0; // 카운터 변수
        Scanner scan = new Scanner(System.in); // 스캐너 불러옴

                while(true){
                    System.out.println("점수를 입력해주세요.");
                int jumsu = scan.nextInt();

                    if(jumsu <0 ){
                        System.out.println("음수가 입력되어서 종료합니다.");
                        break;

                }
                    counter++;
                total += jumsu;

                }
        System.out.println("총합 : " + total);
        System.out.println("평균 : " + ((double)total/counter));
    }
}
