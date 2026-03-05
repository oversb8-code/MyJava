package ch02_control_statement;

public class While01 {
    static void main(String[] args) {
        int total = 0;
            int i = 1; // 초기식 , 변수 정의, while 제어문에서는 초기식을 while 위에
            while(i<11){ // while에서는 조건식을 (소괄호)안에
                total += i;
                i++;
            }


        System.out.println("총합 : " + total); // 출력

    }
}

