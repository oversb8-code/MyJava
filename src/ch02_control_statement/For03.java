package ch02_control_statement;

public class For03 {
    static void main() {
        // 97 + 92 + 87 + ... + 2 = 990
        // 1*1 + 6*6 + 11*11 + ... + 96*96 = 63670

        int total = 0;

        for (int i = 97; i >= 0 ; i-=5){
            total += i;
        }

        System.out.println("총합 : " + total);
    }
}
