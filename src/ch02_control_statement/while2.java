package ch02_control_statement;

public class while2 {
    static void main() {

        int total = 0;
        int x = 1;
        while (x < 101) {
            total += x;
            x += 3;


        }
        System.out.println("총합 : " + total);
    }
}
