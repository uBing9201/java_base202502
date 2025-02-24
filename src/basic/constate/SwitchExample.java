package basic.constate;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("성별을 입력하세요. (M/F): ");
//        String gender = sc.nextLine().toUpperCase();
        String gender = sc.nextLine();

        switch (gender) {
            case "m": case "M": case "ㅡ": case "남":
//            case "m", "M", "ㅡ", "남": <- 자바14버전 이후 개량된 switch
                System.out.println("남성 입니다.");
                break;

            case "f": case "F": case "ㄹ": case "여":
                System.out.println("여성 입니다.");
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

        sc.close();

    }

}
