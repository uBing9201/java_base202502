package basic.constate;

import java.util.Scanner;

public class ifExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score;

        while(true) {
            System.out.print("점수를 입력하세요: ");
            score = sc.nextInt();

            if(score >= 0 && score <= 100) {
                System.out.println("score = " + score);

                if(score >= 60) {
                    // 조건식이 참인 경우.
                    System.out.println("시험에 합격하셨습니다!");
                }else{
                    // 조건식이 거짓인 경우.
                    System.out.println("시험에 불합격하셨습니다!");
                }

                System.out.println("시험 치르느라 고생 많으셨습니다!");
                break;

            } else {
                System.out.println("0~100 이내의 숫자만 입력해주세요.");
            }

        }

        sc.close();

    }

}
