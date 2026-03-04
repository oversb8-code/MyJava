package ch01_variable_operator;

public class aaa {
    static void main() {
        int a = 3 - -2 , b = 3;
        //a = 3 + 2 = 5 , b = 3
        //a = 5, b = 3

        int x = (a >= b) ? 5 :(a+2);
        //x = (5>=3) ? 5 :(5+2)
        // x = (5>=3) ? 5 : 7
        // x = 5

        x += ++a;
        // ++a = 6 = 5 + 1
        // a = 6
        // x = x+ ++a
        // x = 5 + 6
        // x = 11

        int y = ++a;
        // y = 7 = 1 + 6(++a)
        // a = 7

        y += a + --b ;
        // y = y + a + --b
        // y = 7 + 7 + 2
        // y = 16

        char ch3 = 'D' ;
        int z = ch3 >= 'A' && ch3 <= 'Z' ? --y : x + 2 ;
        //조건식 ture
        //x = 11, y=16
        // --y = 15
        // y = 16

        int result = 0;
        result = x >y ? z-y : x+z;
        // x> y (11 > 15) 조건식 false
        //x = 11,  z= --y
        //z = 15
        // result = (x+z) = 11+15 = 26

        System.out.println("result :" + result);






    }
}
