package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

    public static void main(String[] args) {

        /*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다.
		  소수: 약수가 1과 자기 자신만 있는 수.
		 */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + "은(는) 소수가 아닙니다.");
            return;
        }

        int i = 2;
//        while (i <= num / 2) {
//            if (num % i == 0) {
//                System.out.println(num + "은(는) 소수가 아닙니다.");
//                return;
//            }
//            i++;
//        }

//        System.out.println(num + "은(는) 소수입니다.");

        while (num % i != 0) {
            i++;
        }

        System.out.printf("%d은(는) %s\n", num, num == i ? "소수입니다." : "소수가 아닙니다.");

//        int cnt = 0;
//        int i = 1;
//
//        while(i <= num / 2) {
//            if(num % i == 0) {
//                cnt++;
//            }
//            i++;
//        }
//
//        if(cnt ==2) {
//            System.out.println(num + "은(는) 소수입니다.");
//        }else{
//            System.out.println(num + "은(는) 소수가 아닙니다.");
//        }

        sc.close();
    }
}
