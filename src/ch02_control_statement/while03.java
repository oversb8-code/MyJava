package ch02_control_statement;

public class while03 {
    static void main() {
        // 97 + 92 + 87 + ... + 2 = 990
        int total = 0;
        int x = 97 ;
        while (x>=2){
            total += x;
            x -= 5;
        }

        System.out.println("총합 : "+ total); // 출력 {} 중괄호 밖에



        // 1*1 + 6*6 + 11*11 + ... + 96*96 = 63670
        total = 0; //초기화는 int 다시 쓸 필요 X (위에서 변수 정의는 이미 해서)
        int y = 1;
        while (y<100)
        {
            total += y*y ;
            y += 5;
        }
        System.out.println("총합 : " + total);
    }
}
