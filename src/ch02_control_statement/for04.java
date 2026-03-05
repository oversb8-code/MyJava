package ch02_control_statement;

public class for04 {
    static void main() {
        // 1*1 + 6*6 + 11*11 + ... + 96*96 = 63670
        int total = 0;

        for (int i = 1; i<100; i += 5 ){
            total += i*i; // 연산자 체크
        }

        System.out.println("총합 : total "+ total);
    }
}
