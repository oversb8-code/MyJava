package ch03_array;

import java.util.Scanner;

public class arr03 {
    static void main() {
        // 배열 개수 입력,
        //
        // 홀짝 총합,
//문제의 요구사항을 정확히 파악해서 보기.


        Scanner scan = new Scanner(System.in);

        System.out.print("배열 요소 개수 입력 : ");
        int size = scan.nextInt();

        int [] jumsu = new int[size];
        int odd = 0, even = 0; // 합산 변수는 for 반복 전 정의
        for (int i = 0; i < jumsu.length ; i++) {
            System.out.print(i + " 번째 정수 입력 : ");
            jumsu[i] = scan.nextInt(); // 문자열 스캔은 Scan.next

            if (jumsu[i]%2==0) { // 입력한 값이 짝수
                even += jumsu[i];
            }else{ //홀수
                odd += jumsu[i];
            }
        }


        System.out.println("짝수의 합 : "+ even);
        System.out.println("홀수의 합 : " + odd);
    }
}
