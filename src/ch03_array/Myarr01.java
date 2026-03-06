package ch03_array;

public class Myarr01 { // 배열
    static void main() {

        int x = 3, y = 5;

        // 배열 정의 : 정수 3개를 배열로 만들어 봅니다..
        // 타입[] 배열이름 = new 타입[요소 갯수];
        // 요소 갯수는 "배열이름.length" 라는 메소드로 접근이 가능합니다.
        // 밤법 01: new 연산자를 사용하여 배열 정의
        int[] arr = new int[3]; // arr 은 배열 이름입니다.

        //arr[] 변수 하나라고 생각
        arr[0] = x-y+6; // 4
        arr[2] = arr[0] + 3; // 7
        arr[1] = arr[0] + arr[2]; // 11

        for (int i = 0; i < arr.length ; i++) {
            // 조건식이 원래라면 i < 3 인데
            // i < arr.length로 치환하는 이유는
            // 배열의 갯수를 세기 때문에 배열 메소드로 적어주기.
            System.out.println(arr[i]);
        }
        // 방법 02 : 초기화 기법
        int[] brr = {15,30,22};
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
}
