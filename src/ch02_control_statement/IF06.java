package ch02_control_statement;

public class IF06 { // ** 괄호 갯수 제대로 체크하기.. 빼먹어서 오류남
    static void main() {
        int month = 3;
        // 4계절 중 해당 정보 출력

        // month <= 3 , '봄'
        //  &&{and}   ||{or}   !{not}
if ( 3 >= month && month <= 5){
    System.out.println("봄");
}
else if ( 6 >= month && month <= 8) {
    System.out.println("여름");
}
else if (9 >= month && month <= 11) {
    System.out.println("가을");
}
else { //마지막은 조건식 안적어도 됨
    // else if (month ==12 || month ==1 || month ==2)
    // else if (month== 12 && (1 <= month <= 2))
    System.out.println("겨울");
                }
            }
        }