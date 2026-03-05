package ch02_control_statement;

public class forswitch {
    static void main() {

        //1~10 짝수, 홀수 각각 합


        int even = 0; //짝수
        int odd = 0; //홀수


            for (
                    int x = 1; x < 11 ; x++ ){
                if(x%2==0){
            even += x; } else { odd += x;}
        }
        System.out.println("짝수의 합 :" + even);
        System.out.println("홀수의 합 :" + odd);

int odd1 = 0, even1 =0;
        for (int i = 1; i < 11; i++) {
            switch (i%2){
                case 0:
                    even1 += i ;
                    break;

                case 1:
                    odd1 += i ;
                    break;
            }
        }
        System.out.println("짝수 합 : "+ even1);
        System.out.println("홀수 합 : "+ odd1);
           }


       }




