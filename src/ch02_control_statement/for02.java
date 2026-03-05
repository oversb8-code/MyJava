package ch02_control_statement;

public class for02 {
    static void main() {
        //1+4+7+...+100 = 1717

        int total = 0;

        for (int i = 1; i <= 100; i+=3) {
            total += i;
        }
        System.out.println("총합 : total  = " + total );



    }
}
