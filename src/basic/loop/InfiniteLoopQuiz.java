package basic.loop;

import java.util.Random;
import java.util.Scanner;
import java.util.zip.CRC32;

public class InfiniteLoopQuiz {

    public static void main(String[] args) {

        /*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		  지속적으로 문제를 출제한 후 정답을 입력받으세요.
		  사용자가 0을 입력하면 반복문을 탈출시키세요.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */

//        Scanner sc = new Scanner(System.in);
//        Random rand = new Random();
//
//        int correctCount = 0; // 정답 횟수
//        int wrongCount = 0;   // 오답 횟수
//
//        while (true) { // 무한 루프
//            // 1~100 사이의 난수 생성
//            int num1 = rand.nextInt(100) + 1;
//            int num2 = rand.nextInt(100) + 1;
//            int answer = num1 + num2;
//
//            // 문제 출력
//            System.out.print(num1 + " + " + num2 + " = ? (종료: 0) ");
//            int userInput = sc.nextInt(); // 사용자 입력
//
//            // 종료 조건
//            if (userInput == 0) {
//                break; // 0 입력 시 반복문 탈출
//            }
//
//            // 정답 확인
//            if (userInput == answer) {
//                System.out.println("정답입니다!");
//                correctCount++; // 정답 횟수 증가
//            } else {
//                System.out.println("오답입니다! 정답: " + answer);
//                wrongCount++; // 오답 횟수 증가
//            }
//        }
//
//        // 최종 결과 출력
//        System.out.println("\n퀴즈 종료!");
//        System.out.println("정답 횟수: " + correctCount);
//        System.out.println("오답 횟수: " + wrongCount);
//
//        sc.close();

        System.out.println("=============== 해설 ===============");

        Scanner sc2 = new Scanner(System.in);

        int cCount = 0;
        int iCount = 0;

        System.out.println("*** 연산 귀즈 ***");
        System.out.println("# 종료하시려면 -1을 입력하세요.");

        while (true) {

            int rn1 = (int) (Math.random() * 100 + 1);
            int rn2 = (int) (Math.random() * 100 + 1);
            int operator = (int) (Math.random() * 4);

            int correct = 0;
            switch (operator) {
                case 0:
                    System.out.printf("%d + %d = ???\n", rn1, rn2);
                    correct = rn1 + rn2;
                    break;
                case 1:
                    System.out.printf("%d - %d = ???\n", rn1, rn2);
                    correct = rn1 - rn2;
                    break;
                case 2:
                    System.out.printf("%d * %d = ???\n", rn1, rn2);
                    correct = rn1 * rn2;
                    break;
                case 3:
                    System.out.printf("%d / %d = ???\n", rn1, rn2);
                    correct = rn1 / rn2;
                    break;
            }

            System.out.print("> ");
            int answer2 = sc2.nextInt();

            if (answer2 == correct) {
                System.out.println("정답 입니다.");
                cCount++;
            } else if (answer2 == -1) {
                System.out.println("종료 합니다.");
                break;
            } else {
                System.out.println("틀렸습니다.");
                iCount++;
            }
        }

        System.out.println("==============================");
        System.out.println("정답 횟수: " + cCount + "회");
        System.out.println("오답 횟수: " + iCount + "회");

        sc2.close();
    }

}
