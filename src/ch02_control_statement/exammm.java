package ch02_control_statement;

public class exammm { // java 교안 50페이지 1~10  중에 3 또는 5 배수 합 구하기.
    static void main(String[] args) {
int three =0;
int five = 0;

        for (int i = 1; i < 11; i++) {
        if (i%3==0){
            three += i; // 1~10 에서 3의 배수

        }
            else if (i%5==0) {
                five += i; //1~ 10에서 5의 배수
            }
            else {}
        }
        System.out.println("합계 : " + three );
        System.out.println("합계 : " + five );


    }
}

// 3,6,9
// 5,10