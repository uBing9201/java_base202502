package basic.constate;

import java.util.Scanner;

public class SwitchExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요: ");
        int score = sc.nextInt();

        if( score >= 0 && score <= 100 ) {
            switch (score / 10) {
                case 10: case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("F");
                    break;
            }
        } else {
            System.out.println("0~100 사이의 숫자만 입력해주세요");
        }

        sc.close();

    }

}
