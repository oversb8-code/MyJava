package ch03_array;

public class Myarr01 { // 배열
    static void main() {

        int x = 3, y = 5;

        // 배열 정의 : 정수 3개를 배열로 만들어 봅니다..
        // 타입[] 배열이름 = new 타입[요소 갯수];
        int[] arr = new int[3]; // arr 은 배열 이름입니다.

        //arr[] 변수 하나라고 생각
        arr[0] = x-y+6; // 4
        arr[2] = arr[0] + 3; // 7
        arr[1] = arr[0] + arr[2]; // 11
    }
}
