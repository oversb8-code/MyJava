package ch02_control_statement;

public class AdulkCheck {// java에서는 함수를 메소드 라고 함.
    static void main() {
        String name = "김철수";
        int age =12;
        int _gender = 3;
String gender ; // 성별
String adult;

        if(_gender==1 || _gender==3){//남자라면
            gender = "남자";
        }else{
            gender = "여자";
        }

        if (age >=19){
            adult = "성인";
        }else{
            adult = "미성년자";
        }


// println 메소드 : 문자열을 출력하고 엔터키를 누르는 역할을 함.
        // 메소드 = 역할 = 기능 = 함수
        System.out.println("이름 : " + name + " ,나이 : " + age);

        // 서식 지정자 : %s(문자열) , %d(정수)
 // printf 메소드 : 서식 지정자 필요하고 그 뒤에 , 있어야함. & 변수 뒤에도 , 있어야함. 엔터(enter)는 포함 X
        System.out.printf("이름 : %s, 나이 : %d, 성별 : %S, 성인 여부 : %s", name, age, gender, adult);
       // System.out.printf("gkgkgk");



    }
}
