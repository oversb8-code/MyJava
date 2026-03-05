package ch02_control_statement;

public class whileeee {
    static void main() {
        int odd =0, even=0;
        int i=1;
        while(i<11){
            switch (i%2){
                case 0: // 나머지 0일때의 경우
                    even += i;
                    break;

                    case 1: // 나머지 1일때의 경우
                        odd += i;
                        break;

            }
            i++;
        }
        System.out.println("짝수의 합 : "+ even);
        System.out.println("홀수의 합 : "+ odd);
    }
}
;