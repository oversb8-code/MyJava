package ch01_variable_operator;

public class lll {
    static void main() {
        int a = 10, b= 8;

        boolean bool1 = a!=b ;
        // 10 != 8, true
        boolean bool2 = --a == b++;
        // 9 == 8 , false
        // a = 9 , b = 9

        boolean bool3 = a++ != --b ;
        // 9++ != 8
        // 9 <> 8, true
        // a = 10 , b= 8

        boolean bool4 = bool3 && (5>7);
        // bool3 = 10, 8
        // 10 , 8 != (5>7)
        // false

        boolean bool5 = !bool4 || (bool1 && bool2);
        // !false(5>7)  || (a = 10,b = 8 && a = 9 , b = 9)
        // true || (false)
        // true

        //참 거짓
        System.out.println("bool1 :"+bool1);
        System.out.println("bool2 :"+bool2);
        System.out.println("bool3 :"+bool3);
        System.out.println("bool4 :"+bool4);
        System.out.println("bool5 :"+bool5);


        //최대값
        int x= 3, y= 8, z= 4 ;
        int max = x>y || y<x ? x : y;
        System.out.println("max :" + max);

        int max1 = y>z || y<z ? y : z;
        System.out.println("max1 :" + max1);

        int result = max > max1 || max < max1 ? max: max1;
        System.out.println("result :" + result);
        System.out.println(x + "," + y+ "," + z+ "중 최대 수는 "+ result + "입니다." );








        //
    }

}
