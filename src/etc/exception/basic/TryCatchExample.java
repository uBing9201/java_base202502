package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("정수1: ");
            int i = sc.nextInt();
            System.out.print("정수2: ");
            int j = sc.nextInt();
            // try 블록에는 예외 발생 가능성이 있는 코드를 배치합니다.
            System.out.printf("%d / %d = %d\n", i, j, i /j);
        } catch (Exception e) {
            // catch 블록에는 try 에서 실제 예외가 발생했을 시 실행할 내용을 작성
            if(e instanceof InputMismatchException) {
                System.out.println("정수만 입력해주세요.");
            }else if(e instanceof ArithmeticException) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
            e.printStackTrace();

        }

        System.out.println("프로그램 정상 종료");
        sc.close();
    }

}
