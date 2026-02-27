package ch01_variable_operator;

public class asdfff {
    static void main() {
int x =3, y =5 , z;
z = x++ + --y ;

        System.out.println("x: " + x);//4
        System.out.println("y: " + y);//4
        System.out.println("z: " + z);//7

        z+= --x + y++ ; // z= z+ --x + y++ ;
       // z+= a =>> z+a = z 에 다시
        // z = 3 + 4++ ,z = 14
        System.out.println("x: " + x);//3
        System.out.println("y: " + y);//5
        System.out.println("z: " + z);//

    }
}
