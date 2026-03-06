package ch03_array;

import java.util.Scanner;

public class aaa { // 혼자 연습하기
    static void main() {
// 이름 입력하면 다른거 나오게 하기.

        Scanner scan = new Scanner(System.in);
        System.out.print( "오퍼레이터 이름 입력 : ");

        String name = scan.nextLine();
        System.out.println(" - 해당 오퍼레이터와 관련된 정보 표시 ");

        String[] poo = {"레벨","속성", "타입"};

        String[] wonso = new String[poo.length];
        for (int i = 0; i < poo.length; i++) {

            wonso[i] = scan.nextLine();
            System.out.print( "레벨 : ");
            String level = scan.nextLine();

        }


        }
    }
