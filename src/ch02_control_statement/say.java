package ch02_control_statement;

public class say {
    static void main() {
        String message = "안녕하세요.";
        int su = 5;

        //for에 들어간 변수값 확인하기.
        for (int i = 1; i <= su ; i++) {
            System.out.println( message );
        }

    }
}
