package ch03_array;

import java.util.Scanner;

public class StudentExam {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("이름 입력 : ");
        String name = scan.nextLine();

        String[] SSS = {"국어", "영어", "수학"};

        int[] jumsu = new int[SSS.length];

        double total = 0;

        for (int i = 0; i < SSS.length; i++) {
            System.out.print("점수 입력 : ");
            jumsu[i] = scan.nextInt();
            total += jumsu[i];
        }

        double average = (double) total / jumsu.length;

        System.out.println("학생의 정보");
        System.out.println("이름 : "+ name );
        System.out.printf("총점 : %.2f ", total);
        System.out.printf("평균 : %.2f ", average);


    }
}