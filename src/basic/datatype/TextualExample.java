package basic.datatype;

public class TextualExample {

    public static void main(String[] args) {

        // 문자열
        char c1 = 'A';
        System.out.println("c1 = " + c1);

        char c2 = 65;
        System.out.println("c2 = " + c2);


        /*
         # 문자열을 저장할 수 있는 데이터 타입 String
         - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
         - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
         기본 데이터 타입처럼 사용합니다. (사실은 객체 타입)
         */
        String str = "hello";

        String s1 = "my dream";
        String s2 = "is a programmer!";

        // 문자열의 덧셈 연산 -> 문자열은 단순히 연결해서 결합한 결과로 표시된다
        System.out.println(s1 + " " + s2);

        // 문자열과 다른 데이터 타입 간의 덧셈 연산 -> 결과값이 무조건 문자로 취급
        // 문자열 끼리의 덧셈 연산 결과와 같다
        int month = 12;
        int day = 25;
        String anni = "크리스마스";

        System.out.println(month + day + anni);
        System.out.println(anni + month + day);
    }

}
