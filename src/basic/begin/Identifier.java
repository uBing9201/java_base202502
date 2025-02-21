package basic.begin;

public class Identifier {

    public static void main(String[] args) {

        // 1. 식별자는 대/소문자를 철저하게 구분
        int age = 35;
//        int age = 40;
        int Age = 40;

        // 2. 식별자는 숫자로만 이루어지거나 숫자로 시작하면 안됨
//        int 700 = 365;
//        int 7number = 7;
        int number7 = 7;
        int num7ber = 7;

        // 3. 식별자에 공백 못들어간다!
//        int my birth day = 19920101;
        int myBirthDay = 19920101; // camel case 표기법

        // 4. 식별자에 특수기호는 및줄(_), 달러기호($) 를 제외한 사용 불가
        // 사용을 권장하지는 않는다. 이미 사용하기로 약속한 곳이 있다.
        String $hello_ = "안녕";

        // 5. 키워드(예약어)는 식별자로 사용할 수 없다!
        // 키워드란 이미 어떠한 기능을 내포하고 있는 단어.
//        String class = "8반";
        String Class = "8반"; // 가능하긴하나 추천하진 않는다
        String classNumber = "8반"; // 이런식으로 사용하길 권장

        // 6. 한글이나 한자 같은 식별자도 문법적으로 허용하기는 하나 권장하지 않는다.
        int 숫자 = 10;
        int sagwa = 20;


    }
}
