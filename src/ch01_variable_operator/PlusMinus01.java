package ch01_variable_operator;

public class PlusMinus01 { //증감연산자
    static void main() {
        int a = 10, b= 20, c;

        c= ++a + b++ ;
        //2 3 1 4

        System.out.println("a : " +a); // 11
        System.out.println("b : " +b); // 21
        System.out.println("c : " +c); // 31

        c = a++ + --b ;
        //4 3 1 2
        System.out.println("a : " + a); // 12
        System.out.println("b : " + b); // 20
        System.out.println("c : " + c); // 31

        a = 15 ;
        b = 12 ;
        c = --a + --b ;
        //2 4 3 1
        System.out.println("a : " + a); // 14
        System.out.println("b : " + b); // 11
        System.out.println("c : " + c); // 25

        a = 10;
        b= 20;
        ++a ; // 11
        b-- ; //19
        c= ++a + b-- ; // 31 = 12 + 19
        // 2 3 1 4
        System.out.println("a : " + a); // 12
        System.out.println("b : " + b); // 18
        System.out.println("c : " + c); // 31

    }
}
