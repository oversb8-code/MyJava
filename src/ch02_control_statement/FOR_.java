package ch02_control_statement;

public class FOR_ {
    static void main(String[] args) {
        int total = 0;


        // 1 + 2 + 3 + ... + 50 = 1275
        for (int i = 1; i < 51; i++) {
            total += i;
        }
        System.out.println("합계 : "+total);

        // 2 + 4 + 6 + ... + 100 = 2550
        total = 0;

for(int x = 2; x<101; x+=2  ) {
 total += x;
}
System.out.println("합계 : " + total);

        // 1 + 3 + 5 + ... + 99 = 2500
        total = 0;
        for (int i = 1; i < 100; i+=2) {
            total += i;
        }
        System.out.println("합계 : " + total);

        // 100 + 95 + 90 + ... + 5 = 1050
        total = 0;
        for (int i = 100; i > 4 ; i-=5) {
            total += i;
        }
        System.out.println("합계 : " +total);


        // 2² + 4² + 6² + ... + 20² = 1540
total = 0;
        for (int i = 2; i < 21; i+=2) {
            total+=i*i;
        }
        System.out.println("합계 : " +total);

        // 5² + 10² + 15² + ... + 100²= 71750
total =0;
        for (int i = 5; i < 101; i+=5) {
            total += i*i;
        }
        System.out.println("합계 : " + total);




    }
}
