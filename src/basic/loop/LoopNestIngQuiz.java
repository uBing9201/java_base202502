package basic.loop;

import java.util.Scanner;

public class LoopNestIngQuiz {

    public static void main(String[] args) {

        /*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		  가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

		 ex)
		 입력받은 수 -> 30
		 소수: 2 3 5 7 11 13 17 19 23 29
		 소수의 개수: 10개
		*/

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("정수를 입력하세요: ");
//        int num = sc.nextInt();
//
//        int count = 0;
//        System.out.print("소수: ");
//
//        for (int i = 2; i <= num; i++) {
//            boolean isPrime = true; // 해당 숫자가 소수인지 여부
//
//            // 2부터 i-1까지의 숫자들로 나누어 보며 소수인지 확인
//            // Math.sqrt = 제곱근 값 리턴 해주는 메서드
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false; // 나누어지면 소수가 아님
//                    break;
//                }
//            }
//
//            // 소수일 경우 출력
//            if (isPrime) {
//                System.out.print(i + " ");
//                count++;
//            }
//        }
//
//        // 소수의 개수 출력
//        System.out.println();
//        System.out.println("소수의 개수: " + count + "개");
//
//        sc.close();

        System.out.println("=============== 해설 ===============");

        Scanner sc2 = new Scanner(System.in);
        System.out.println("정수: ");
        int num2 = sc2.nextInt();

        int count2 = 0; // 소수의 개수가 몇 개인지를 기억할 변수.

        for (int i = 2; i <= num2; i++) {
            int cnt = 0; // 소수 판별을 위해 나누어 떨어진 횟수를 세 줄 변수

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt == 2) {
                System.out.print(i + " ");
                count2++;
            }
        }

        System.out.println("\n소수의 개수: " + count2 + "개");

        sc2.close();

    }

}
